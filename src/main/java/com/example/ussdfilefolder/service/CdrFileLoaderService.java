package com.example.ussdfilefolder.service;

import com.example.ussdfilefolder.entity.CallDetailRecord;
import com.example.ussdfilefolder.entity.CdrLog;
import com.example.ussdfilefolder.repository.CallDetailRecordRepository;
import com.example.ussdfilefolder.repository.CdrLogRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.Optional;

@Service
public class CdrFileLoaderService {

    private final CallDetailRecordRepository cdrRepository;
    private final CdrLogRepository logRepository;
    private final CdrFileParser parser;

    
    @Value("${cdr.folder.path}")
    private String folderPath;

    public CdrFileLoaderService(
            CallDetailRecordRepository cdrRepository,
            CdrLogRepository logRepository,
            CdrFileParser parser
    ) {
        this.cdrRepository = cdrRepository;
        this.logRepository = logRepository;
        this.parser = parser;
    }

    
    @Scheduled(fixedDelay = 60000)
    public void processFiles() {
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("CDR folder does not exist: " + folderPath);
            return;
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files == null || files.length == 0) {
            System.out.println("No files to process.");
            return;
        }

        for (File file : files) {
            processFile(file);
        }
    }

    private void processFile(File file) {
        System.out.println("Processing file: " + file.getName());

        CdrLog log = new CdrLog();
        log.setFileName(file.getName());
        log.setUploadStartTime(new Timestamp(System.currentTimeMillis()));

        int successCount = 0;
        int failureCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Optional<CallDetailRecord> optionalRecord = parser.parseLine(line);
                if (optionalRecord.isPresent()) {
                    cdrRepository.save(optionalRecord.get());
                    successCount++;
                } else {
                    failureCount++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        log.setUploadEndTime(new Timestamp(System.currentTimeMillis()));
        log.setSuccessCount(successCount);
        log.setFailureCount(failureCount);

        logRepository.save(log);

        System.out.println("Finished processing " + file.getName() + ": Success=" + successCount + ", Failures=" + failureCount);

       
        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("Deleted processed file: " + file.getName());
        } else {
            System.err.println("Failed to delete file: " + file.getName());
        }
    }
}
