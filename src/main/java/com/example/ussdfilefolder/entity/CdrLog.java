package com.example.ussdfilefolder.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cdr_logs")
public class CdrLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "upload_start_time")
    private Timestamp uploadStartTime;

    @Column(name = "upload_end_time")
    private Timestamp uploadEndTime;

    @Column(name = "success_count")
    private Integer successCount;

    @Column(name = "failure_count")
    private Integer failureCount;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Timestamp getUploadStartTime() {
        return uploadStartTime;
    }

    public void setUploadStartTime(Timestamp uploadStartTime) {
        this.uploadStartTime = uploadStartTime;
    }

    public Timestamp getUploadEndTime() {
        return uploadEndTime;
    }

    public void setUploadEndTime(Timestamp uploadEndTime) {
        this.uploadEndTime = uploadEndTime;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }
}
