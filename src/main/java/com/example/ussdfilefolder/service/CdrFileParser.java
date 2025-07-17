package com.example.ussdfilefolder.service;

import com.example.ussdfilefolder.entity.CallDetailRecord;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Optional;

@Service
public class CdrFileParser {

    public Optional<CallDetailRecord> parseLine(String line) {
        try {
          
            String[] parts = line.split("\\|", -1);

           
            if (parts.length < 33) {
                return Optional.empty();
            }

            CallDetailRecord record = new CallDetailRecord();

            
            record.setRecordDate(parseTimestamp(parts[0]));
            record.setLSpc(parseInteger(parts[1]));
            record.setLSsn(parseInteger(parts[2]));
            record.setLRi(parseInteger(parts[3]));
            record.setLGtI(parseInteger(parts[4]));
            record.setLGtDigits(parts[5]);
            record.setRSpc(parseInteger(parts[6]));
            record.setRSsn(parseInteger(parts[7]));
            record.setRRi(parseInteger(parts[8]));
            record.setRGtI(parseInteger(parts[9]));
            record.setRGtDigits(parts[10]);
            record.setServiceCode(parts[11]);
            record.setOrNature(parseInteger(parts[12]));
            record.setOrPlan(parseInteger(parts[13]));
            record.setOrDigits(parts[14]);
            record.setDeNature(parseInteger(parts[15]));
            record.setDePlan(parseInteger(parts[16]));
            record.setDeDigits(parts[17]);
            record.setIsdnNature(parseInteger(parts[18]));
            record.setIsdnPlan(parseInteger(parts[19]));
            record.setMsisdn(parts[20]);
            record.setVlrNature(parseInteger(parts[21]));
            record.setVlrPlan(parseInteger(parts[22]));
            record.setVlrDigits(parts[23]);
            record.setImsi(parts[24]);
            record.setStatus(parts[25]);
            record.setType(parts[26]);
            record.setTstamp(parseTimestamp(parts[27]));
            record.setLocalDialogId(parseLong(parts[28]));
            record.setRemoteDialogId(parseLong(parts[29]));
            record.setDialogDuration(parseLong(parts[30]));
            record.setUssdString(parts[31]);
            record.setId(parts[32]);

            return Optional.of(record);
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    private Integer parseInteger(String s) {
        return (s == null || s.isBlank()) ? null : Integer.valueOf(s);
    }

    private Long parseLong(String s) {
        return (s == null || s.isBlank()) ? null : Long.valueOf(s);
    }

    private Timestamp parseTimestamp(String s) {
        return (s == null || s.isBlank()) ? null : Timestamp.valueOf(s);
    }
}
