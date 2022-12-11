/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  dheer
 * Created: 19-Nov-2022
 */
DROP DATABASE IF EXISTS INNEEDAPPLICATIONDATABASE;
CREATE DATABASE INNEEDAPPLICATIONDATABASE;
USE INNEEDAPPLICATIONDATABASE;
CREATE TABLE USER(
NAME VARCHAR(100),
ID VARCHAR(100),
AGE VARCHAR(100),
COUNTRY VARCHAR(100),
SIN VARCHAR(100),
STATUS VARCHAR(100),
PERMIT_NUMBER VARCHAR(100),
PHONENUMBER VARCHAR(100),
EMAIL VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);

CREATE TABLE SIN(
NAME VARCHAR(100),
SIN VARCHAR(100),
PHONENUMBER VARCHAR(100),
EMAIL VARCHAR(100),
STATUS VARCHAR(100)
);



CREATE TABLE SIN_OFFICER(
NAME VARCHAR(100),
SIN VARCHAR(100),
PHONENUMBER VARCHAR(100),
EMAIL VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100)
);



CREATE TABLE SIN_EMP(
NAME VARCHAR(100),
SIN VARCHAR(100),
PHONENUMBER VARCHAR(100),
EMAIL VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100),
ASSIGNED VARCHAR(100)
);



CREATE TABLE INCIDENT(
USERID VARCHAR(100),
INCIDENT VARCHAR(100),
INCIDENT_ID VARCHAR(100),
INCIDENT_DATE varchar(100),
INCIDENT_TYPE varchar(100),
STREET VARCHAR(100),
CITY VARCHAR(100),
POSTAL_CODE VARCHAR(100),
PICTURE VARCHAR(100),
STATUS VARCHAR(100),
MESSAGE VARCHAR(100)
);



CREATE TABLE INCIDENT_MANAGER(
USERID VARCHAR(100),
INCIDENT VARCHAR(100),
INCIDENT_ID VARCHAR(100),
INCIDENT_DATE varchar(100),
INCIDENT_TYPE varchar(100),
STREET VARCHAR(100),
CITY VARCHAR(100),
POSTAL_CODE VARCHAR(100),
PICTURE VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100),
MESSAGE VARCHAR(100)
);



CREATE TABLE INCIDENT_EMPLOYEE(
USERID VARCHAR(100),
INCIDENT VARCHAR(100),
INCIDENT_ID VARCHAR(100),
INCIDENT_DATE varchar(100),
INCIDENT_TYPE varchar(100),
STREET VARCHAR(100),
CITY VARCHAR(100),
POSTAL_CODE VARCHAR(100),
PICTURE VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100),
ASSIGNED VARCHAR(100),
MESSAGE VARCHAR(100)
);



CREATE TABLE TAXES(
USERID VARCHAR(100),
CLAIM_NAME VARCHAR(100),
TAX_ID VARCHAR(100),
SIN VARCHAR(100),
ACCOUNT_NUMBER VARCHAR(100),
START_DURATION VARCHAR(100),
END_DURATION VARCHAR(100),
ANNUAL_INCOME VARCHAR(100),
TAXES_PAID VARCHAR(100),
STATUS VARCHAR(100)
);



CREATE TABLE TAX_OFFICER(
USERID VARCHAR(100),
CLAIM_NAME VARCHAR(100),
TAX_ID VARCHAR(100),
SIN VARCHAR(100),
ACCOUNT_NUMBER VARCHAR(100),
START_DURATION VARCHAR(100),
END_DURATION VARCHAR(100),
ANNUAL_INCOME VARCHAR(100),
TAXES_PAID VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100)
);




CREATE TABLE TAX_EMPLOYEE(
USERID VARCHAR(100),
CLAIM_NAME VARCHAR(100),
TAX_ID VARCHAR(100),
SIN VARCHAR(100),
ACCOUNT_NUMBER VARCHAR(100),
START_DURATION VARCHAR(100),
END_DURATION VARCHAR(100),
ANNUAL_INCOME VARCHAR(100),
TAXES_PAID VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100),
ASSIGNED VARCHAR(100)
);



CREATE TABLE BANK(
USERID VARCHAR(100),
BANK_ID VARCHAR(100),
BANK_NAME VARCHAR(100),
TYPE VARCHAR(100),
ACCOUNT_NUMBER VARCHAR(100),
SIN VARCHAR(100),
PHONE VARCHAR(100),
AMOUNT VARCHAR(100),
STATUS VARCHAR(100)
);



CREATE TABLE BANK_MANAGER(
USERID VARCHAR(100),
BANK_ID VARCHAR(100),
BANK_NAME VARCHAR(100),
TYPE VARCHAR(100),
ACCOUNT_NUMBER VARCHAR(100),
SIN VARCHAR(100),
PHONE VARCHAR(100),
AMOUNT VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100)
);



CREATE TABLE BANK_EMPLOYEE(
USERID VARCHAR(100),
BANK_ID VARCHAR(100),
BANK_NAME VARCHAR(100),
TYPE VARCHAR(100),
ACCOUNT_NUMBER VARCHAR(100),
SIN VARCHAR(100),
PHONE VARCHAR(100),
AMOUNT VARCHAR(100),
STATUS VARCHAR(100),
REFERRED VARCHAR(100),
ASSIGNED VARCHAR(100)
);



CREATE TABLE ADMIN(
ADMINID VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);
INSERT INTO ADMIN(ADMINID,USERNAME,PASSWORD)  VALUES('S001', 'sysadmin1','Admin@123');
INSERT INTO ADMIN(ADMINID,USERNAME,PASSWORD)  VALUES('S002', 'sysadmin2','Admin@123');
INSERT INTO ADMIN(ADMINID,USERNAME,PASSWORD)  VALUES('S003', 'sysadmin3','Admin@123');
INSERT INTO ADMIN(ADMINID,USERNAME,PASSWORD)  VALUES('S004', 'sysadmin4','Admin@123');
INSERT INTO ADMIN(ADMINID,USERNAME,PASSWORD)  VALUES('S005', 'sysadmin5','Admin@123');



CREATE TABLE BANK_MANAGER_LOGIN(
MANAGERID VARCHAR(100),
BANK_NAME VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);
INSERT INTO BANK_MANAGER_LOGIN(MANAGERID,BANK_NAME,USERNAME,PASSWORD)  VALUES('M001','CIBC', 'manager1','Manager@123');
INSERT INTO BANK_MANAGER_LOGIN(MANAGERID,BANK_NAME,USERNAME,PASSWORD)  VALUES('M002','RBC', 'manager2','Manager@123');
INSERT INTO BANK_MANAGER_LOGIN(MANAGERID,BANK_NAME,USERNAME,PASSWORD)  VALUES('M003','TD', 'manager3','Manager@123');
INSERT INTO BANK_MANAGER_LOGIN(MANAGERID,BANK_NAME,USERNAME,PASSWORD)  VALUES('M004','SCOTIA', 'manager4','Manager@123');



CREATE TABLE BANK_EMPLOYEE_LOGIN(
EMPLOYEEID VARCHAR(100),
BANK_NAME VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);
INSERT INTO BANK_EMPLOYEE_LOGIN(EMPLOYEEID,BANK_NAME,USERNAME,PASSWORD)  VALUES('E001','CIBC', 'employee1','Employee@123');
INSERT INTO BANK_EMPLOYEE_LOGIN(EMPLOYEEID,BANK_NAME,USERNAME,PASSWORD)  VALUES('E005','CIBC', 'employee5','Employee@123');
INSERT INTO BANK_EMPLOYEE_LOGIN(EMPLOYEEID,BANK_NAME,USERNAME,PASSWORD)  VALUES('E006','CIBC', 'employee6','Employee@123');
INSERT INTO BANK_EMPLOYEE_LOGIN(EMPLOYEEID,BANK_NAME,USERNAME,PASSWORD)  VALUES('E002','RBC', 'employee2','Employee@123');
INSERT INTO BANK_EMPLOYEE_LOGIN(EMPLOYEEID,BANK_NAME,USERNAME,PASSWORD)  VALUES('E007','RBC', 'employee7','Employee@123');
INSERT INTO BANK_EMPLOYEE_LOGIN(EMPLOYEEID,BANK_NAME,USERNAME,PASSWORD)  VALUES('E003','TD' ,'employee3','Employee@123');
INSERT INTO BANK_EMPLOYEE_LOGIN(EMPLOYEEID,BANK_NAME,USERNAME,PASSWORD)  VALUES('E004','SCOTIA' ,'employee4','Employee@123');




CREATE TABLE TAX_OFFICER_LOGIN(
OFFICERID VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);

INSERT INTO TAX_OFFICER_LOGIN(OFFICERID,USERNAME,PASSWORD)  VALUES('O001', 'officer1','Officer@123');
INSERT INTO TAX_OFFICER_LOGIN(OFFICERID,USERNAME,PASSWORD)  VALUES('O002', 'officer2','Officer@123');
INSERT INTO TAX_OFFICER_LOGIN(OFFICERID,USERNAME,PASSWORD)  VALUES('O003', 'officer3','Officer@123');
INSERT INTO TAX_OFFICER_LOGIN(OFFICERID,USERNAME,PASSWORD)  VALUES('O004', 'officer4','Officer@123');



CREATE TABLE TAX_EMPLOYEE_LOGIN(
EMPLOYEEID VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);

INSERT INTO TAX_EMPLOYEE_LOGIN(EMPLOYEEID,USERNAME,PASSWORD)  VALUES('ET001', 'emp1','Emp@123');
INSERT INTO TAX_EMPLOYEE_LOGIN(EMPLOYEEID,USERNAME,PASSWORD)  VALUES('ET002', 'emp2','Emp@123');
INSERT INTO TAX_EMPLOYEE_LOGIN(EMPLOYEEID,USERNAME,PASSWORD)  VALUES('ET003', 'emp3','Emp@123');
INSERT INTO TAX_EMPLOYEE_LOGIN(EMPLOYEEID,USERNAME,PASSWORD)  VALUES('ET004', 'emp4','Emp@123');


CREATE TABLE SIN_OFFICER_LOGIN(
OFFICEID VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);
INSERT INTO SIN_OFFICER_LOGIN(OFFICEID,USERNAME,PASSWORD)  VALUES('SI001', 'sin1','Sin@123');
INSERT INTO SIN_OFFICER_LOGIN(OFFICEID,USERNAME,PASSWORD)  VALUES('SI002', 'sin2','Sin@123');
INSERT INTO SIN_OFFICER_LOGIN(OFFICEID,USERNAME,PASSWORD)  VALUES('SI003', 'sin3','Sin@123');
INSERT INTO SIN_OFFICER_LOGIN(OFFICEID,USERNAME,PASSWORD)  VALUES('SI004', 'sin4','Sin@123');


CREATE TABLE SIN_EMP_LOGIN(
EMPID VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);
INSERT INTO SIN_EMP_LOGIN(EMPID,USERNAME,PASSWORD)  VALUES('ES001', 'emp1','Emp@123');
INSERT INTO SIN_EMP_LOGIN(EMPID,USERNAME,PASSWORD)  VALUES('ES002', 'emp2','Emp@123');
INSERT INTO SIN_EMP_LOGIN(EMPID,USERNAME,PASSWORD)  VALUES('ES003', 'emp3','Emp@123');
INSERT INTO SIN_EMP_LOGIN(EMPID,USERNAME,PASSWORD)  VALUES('ES004', 'emp4','Emp@123');



CREATE TABLE INCIDENT_OFFICER_LOGIN(
OFFICERID VARCHAR(100),
ORGANISATION_NAME VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);

INSERT INTO INCIDENT_OFFICER_LOGIN(OFFICERID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('I001','POLICE', 'incident1','Incident@123');
INSERT INTO INCIDENT_OFFICER_LOGIN(OFFICERID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('I002','POLICE', 'incident2','Incident@123');
INSERT INTO INCIDENT_OFFICER_LOGIN(OFFICERID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('I003','HOSPITAL', 'incident3','Incident@123');
INSERT INTO INCIDENT_OFFICER_LOGIN(OFFICERID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('I004','HOSPITAL', 'incident4','Incident@123');
INSERT INTO INCIDENT_OFFICER_LOGIN(OFFICERID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('I005','FIRE_ENGINE', 'incident5','Incident@123');
INSERT INTO INCIDENT_OFFICER_LOGIN(OFFICERID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('I006','FIRE_ENGINE', 'incident6','Incident@123');




CREATE TABLE INCIDENT_EMPLOYEE_LOGIN(
EMPLOYEEID VARCHAR(100),
ORGANISATION_NAME VARCHAR(100),
USERNAME VARCHAR(100),
PASSWORD VARCHAR(100)
);

INSERT INTO INCIDENT_EMPLOYEE_LOGIN(EMPLOYEEID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('IE001','POLICE', 'emp1','Emp@123');
INSERT INTO INCIDENT_EMPLOYEE_LOGIN(EMPLOYEEID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('IE002','POLICE', 'emp2','Emp@123');
INSERT INTO INCIDENT_EMPLOYEE_LOGIN(EMPLOYEEID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('IE003','HOSPITAL', 'emp3','Emp@123');
INSERT INTO INCIDENT_EMPLOYEE_LOGIN(EMPLOYEEID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('IE004','HOSPITAL', 'emp4','Emp@123');
INSERT INTO INCIDENT_EMPLOYEE_LOGIN(EMPLOYEEID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('IE005','FIRE_ENGINE', 'emp5','Emp@123');
INSERT INTO INCIDENT_EMPLOYEE_LOGIN(EMPLOYEEID,ORGANISATION_NAME,USERNAME,PASSWORD)  VALUES('IE006','FIRE_ENGINE', 'emp6','Emp@123');





CREATE TABLE FINE(
USERID VARCHAR(100),
INCIDENT_ID VARCHAR(100),
FINE_AMOUNT VARCHAR(100),
REASON VARCHAR(100)
);