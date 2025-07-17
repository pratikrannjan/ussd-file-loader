USSD File Loader – Project Summary

This Spring Boot app automatically loads USSD CDR files from a folder and inserts them into a PostgreSQL database.

What It Does

Monitors cdr-files/ folder every 1 minute

If a .txt file is found:

Parses each line as a USSD event

Saves records to call_detail_records table

Logs success/failure stats in cdr_logs table

Deletes the file after processing



Folder Setup

ussd-file-loader/
├── pom.xml
├── src/
├── cdr-files/
│   └── sampleholder_cdr.txt

Requirements

Java 17

PostgreSQL (ussd DB created)

Maven


Configuration (application.properties)

spring.datasource.url=jdbc:postgresql://localhost:5432/ussd
spring.datasource.username=postgres
spring.datasource.password=your_password
cdr.folder.path=./cdr-files

How to Run

mvn spring-boot:run

Output

USSD events saved in call_detail_records

File summary logged in cdr_logs

File gets deleted after processing



