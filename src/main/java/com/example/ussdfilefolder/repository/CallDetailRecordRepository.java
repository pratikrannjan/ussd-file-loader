package com.example.ussdfilefolder.repository;

import com.example.ussdfilefolder.entity.CallDetailRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallDetailRecordRepository extends JpaRepository<CallDetailRecord, String> {
  
}
