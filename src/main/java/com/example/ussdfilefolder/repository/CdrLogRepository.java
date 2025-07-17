package com.example.ussdfilefolder.repository;

import com.example.ussdfilefolder.entity.CdrLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CdrLogRepository extends JpaRepository<CdrLog, Long> {
   
}

