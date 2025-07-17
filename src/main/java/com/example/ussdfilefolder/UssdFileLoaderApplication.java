package com.example.ussdfilefolder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UssdFileLoaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UssdFileLoaderApplication.class, args);
    }
}
