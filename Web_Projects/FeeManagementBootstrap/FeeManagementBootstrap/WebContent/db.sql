CREATE TABLE  "FEE_STUDENT" 
   ("ROLLNO" VARCHAR2(4000), 
	"NAME" VARCHAR2(4000), 
	"EMAIL" VARCHAR2(4000), 
	"SEX" VARCHAR2(4000), 
	"COURSE" VARCHAR2(4000), 
	"FEE" NUMBER, 
	"PAID" NUMBER, 
	"DUE" NUMBER, 
	"ADDRESS" VARCHAR2(4000), 
	"CONTACT" VARCHAR2(4000), 
	 CONSTRAINT "FEE_STUDENT_PK" PRIMARY KEY ("ROLLNO") ENABLE
   )
/

CREATE TABLE  "FEE_ACCOUNTANT" 
   (	"ID" NUMBER, 
	"NAME" VARCHAR2(4000), 
	"EMAIL" VARCHAR2(4000), 
	"PASSWORD" VARCHAR2(4000), 
	"ADDRESS" VARCHAR2(4000), 
	"CONTACT" VARCHAR2(4000), 
	 CONSTRAINT "FEE_ACCOUNTANT_PK" PRIMARY KEY ("ID") ENABLE
   )
/

=================
MYSQL
==================
CREATE  TABLE `online`.`FEE_STUDENT` (

  `ROLLNO` INT NOT NULL AUTO_INCREMENT ,

  `NAME` VARCHAR(45) NULL ,

  `EMAIL` VARCHAR(45) NULL ,

  `SEX` VARCHAR(45) NULL ,

  `COURSE` VARCHAR(45) NULL ,

  `FEE` DECIMAL(10) NULL ,

  `PAID` DECIMAL(10) NULL ,

  `DUE` DECIMAL(10) NULL ,

  `ADDRESS` VARCHAR(45) NULL ,

  `CONTACT` VARCHAR(45) NULL ,

  PRIMARY KEY (`ROLLNO`) );


  CREATE  TABLE `online`.`FEE_ACCOUNTANT` (

  `ID` INT NOT NULL AUTO_INCREMENT ,

  `NAME` VARCHAR(45) NULL ,

  `EMAIL` VARCHAR(45) NULL ,

  `PASSWORD` VARCHAR(45) NULL ,

  `ADDRESS` VARCHAR(45) NULL ,

  `CONTACT` VARCHAR(45) NULL ,

  PRIMARY KEY (`ID`) );

