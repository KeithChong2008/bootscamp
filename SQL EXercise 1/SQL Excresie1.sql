

CREATE DATABASE BOOTCAMP_EXERCISE1;
Use BOOTCAMP_EXERCISE1;
show tables;



CREATE TABLE REGIONS(
	REGION_ID INTEGER  primary key,
    REGION_NAME VARCHAR(25) NOT NULL
);

CREATE TABLE COUNTRIES (
  COUNTRY_ID CHAR(2) PRIMARY KEY,
  COUNTRY_NAME VARCHAR(40) NOT NULL,
  REGION_ID INTEGER NOT NULL,
  FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID)
);

CREATE TABLE   LOCATIONS(
LOCATION_ID INTEGER (50)  primary key,
STRESS_ADDRESS VARCHAR(25) NOT NULL,
POSTAL_CODE VARCHAR(12) NOT NULL,
CITY VARCHAR(30) NOT NULL,
STATE_PROVINCE VARCHAR(12),
COUNTRY_ID CHAR(2) NOT NULL,
 FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
);

ALTER TABLE LOCATIONS
MODIFY STATE_PROVINCE VARCHAR(20);



CREATE TABLE DEPARTMENTS (
  DEPARTMENT_ID INTEGER PRIMARY KEY,
  DEPARTMENT_NAME VARCHAR(30) NOT NULL,
  MANAGER_ID INTEGER NOT NULL,
  LOCATION_ID INTEGER NOT NULL,
  FOREIGN KEY (  LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
  
);

CREATE TABLE EMPLOYEES (
  EMPLOYEE_ID INTEGER PRIMARY KEY,
  FIRST_NAME VARCHAR(20) NOT NULL,
  LAST_NAME VARCHAR(25) NOT NULL,
  EMAIL VARCHAR(25) NOT NULL,
  PHONE_NUMBER VARCHAR(20) NOT NULL,
  HIRE_DATE DATE NOT NULL,
  JOB_ID VARCHAR(10) NOT NULL,
  SALARY DECIMAL(10, 2),
  COMMISSION_PCT DECIMAL(10, 2),
  MANAGER_ID INTEGER,
  DEPARTMENT_ID INTEGER,
  FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS (DEPARTMENT_ID),
  FOREIGN KEY (EMPLOYEE_ID) REFERENCES JOB_HISTORY(EMPLOYEE_ID),
  FOREIGN KEY (JOB_ID) REFERENCES JOBS (JOB_ID)
);

CREATE TABLE JOBS (
  JOB_ID VARCHAR(10) PRIMARY KEY,
  JOB_TITLE VARCHAR(35),
  MIN_SALARY INTEGER,
  MAX_SALARY INTEGER
);

Select * From JOBS;

CREATE TABLE JOB_HISTORY (
  EMPLOYEE_ID INTEGER,
  START_DATE DATE,
  END_DATE DATE,
  JOB_ID VARCHAR(10),
  DEPARTMENT_ID INTEGER,
  FOREIGN KEY (JOB_ID) REFERENCES JOBS(JOB_ID),
  FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID),
  PRIMARY KEY (EMPLOYEE_ID, START_DATE)
);




INSERT INTO REGIONS(REGION_ID,REGION_NAME) values(1, 'DEK');
INSERT INTO REGIONS(REGION_ID,REGION_NAME) values(2, 'ITD');
INSERT INTO REGIONS(REGION_ID,REGION_NAME) values(3,'JPP');
INSERT INTO REGIONS(REGION_ID,REGION_NAME) values(4,'USS');

INSERT INTO COUNTRIES (COUNTRY_ID , COUNTRY_NAME, REGION_ID) values ( 'DE', 'Germany', 1);
INSERT INTO COUNTRIES (COUNTRY_ID , COUNTRY_NAME, REGION_ID) values ( 'IT','Italy',1);
INSERT INTO COUNTRIES (COUNTRY_ID , COUNTRY_NAME, REGION_ID) values ( 'JP','Japan',3);
INSERT INTO COUNTRIES (COUNTRY_ID , COUNTRY_NAME, REGION_ID) values ( 'US','United State' ,2);

INSERT INTO LOCATIONS (LOCATION_ID,STRESS_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID) values (1000, '1297 Via Cola di Rie', '989','Roma',Null,'IT');
INSERT INTO LOCATIONS (LOCATION_ID,STRESS_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID) values (1100, '93091 Calle della Te', '10934','Venice', Null, 'IT');
INSERT INTO LOCATIONS (LOCATION_ID,STRESS_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID) values (1200,'2017 Shinjuku-ku','1689','Tokyo','Tokyo Prefectu', 'JP');
INSERT INTO LOCATIONS (LOCATION_ID,STRESS_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID) values (1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US');



INSERT INTO  DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID,LOCATION_ID) values (10,'Administration',200,1100);
INSERT INTO  DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME,MANAGER_ID,LOCATION_ID) values (20,'Marketing',201,1200);
INSERT INTO  DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID,LOCATION_ID) values (30,'Purchasing',202,1400);


INSERT INTO JOBS (JOB_ID, JOB_TITLE ,  MIN_SALARY,  MAX_SALARY) values ('ST_CLERK','Manager', 200,3000);
INSERT INTO JOBS (JOB_ID, JOB_TITLE ,  MIN_SALARY,  MAX_SALARY) values ('MK_REP','Manager', 200,3000);
INSERT INTO JOBS (JOB_ID, JOB_TITLE ,  MIN_SALARY,  MAX_SALARY) values ('IT_PROG','Manager', 200,3000);



INSERT INTO JOB_HISTORY (EMPLOYEE_ID, START_DATE,END_DATE,JOB_ID, DEPARTMENT_ID) values (101,'1990-1-1','1991-1-1','2',20);
INSERT INTO JOB_HISTORY (EMPLOYEE_ID, START_DATE,END_DATE,JOB_ID, DEPARTMENT_ID) values (100,'1990-1-1','1991-1-1','2',20);
INSERT INTO JOB_HISTORY (EMPLOYEE_ID, START_DATE,END_DATE,JOB_ID, DEPARTMENT_ID) values (102,'1990-1-1','1991-1-1','2',20);



INSERT INTO  EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID ) values (
100,'Steven','King','SKING','515-1234567','1987-06-17','ST_CLERK',24000.00,0.00,109,10);

INSERT INTO  EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID ) values (
101,'Neena','Kochhar','NKOCHHAR','515-1234568','1987-06-18','MK_REP',17000.00,0.00,103,20);

INSERT INTO  EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID ) values (
102,'Lex','De Haan', 'LDEHAAN', '515-1234569','1987-06-19','IT_PROG',17000.00,0.00,108,30);

-- 3

Select LOCATION_ID, STRESS_ADDRESS,CITY,STATE_PROVINCE
FROM LOCATIONS;

-- 4
Select FIRST_NAME,LAST_NAME,JOB_ID,DEPARTMENT_ID
FROM EMPLOYEES;

-- 5
SELECT FIRST_NAME,LAST_NAME,JOB_ID,DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (
    SELECT DEPARTMENT_ID
    FROM DEPARTMENTS
    WHERE LOCATION_ID IN (
        SELECT LOCATION_ID
        FROM LOCATIONS
        WHERE COUNTRY_ID = 'JP'
    )
);

-- 6 
SELECT e.EMPLOYEE_ID, e.LAST_NAME, e.MANAGER_ID, m.LAST_NAME AS MANAGER_LAST_NAME
FROM EMPLOYEES e
JOIN EMPLOYEES m ON e.MANAGER_ID = m.EMPLOYEE_ID;

-- 7
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE > (
    SELECT HIRE_DATE
    FROM EMPLOYEES
    WHERE LAST_NAME = 'De Haan'
);

-- 8 
SELECT D.DEPARTMENT_NAME, COUNT(E.EMPLOYEE_ID) AS NUMBER_OF_EMPLOYEES
FROM DEPARTMENTS D
LEFT JOIN EMPLOYEES E ON D.DEPARTMENT_ID = E.DEPARTMENT_ID
GROUP BY D.DEPARTMENT_NAME;

-- 9

SELECT JH.EMPLOYEE_ID, J.JOB_TITLE, DATEDIFF(JH.END_DATE, JH.START_DATE) AS DAY_DIFFERENCE
FROM JOB_HISTORY JH
JOIN JOBS J ON JH.JOB_ID = J.JOB_ID
WHERE JH.DEPARTMENT_ID = 30;

-- 10
SELECT D.DEPARTMENT_NAME, CONCAT(M.FIRST_NAME, ' ', M.LAST_NAME) AS MANAGER_NAME, L.CITY, C.COUNTRY_NAME
FROM DEPARTMENTS D
JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID
JOIN COUNTRIES C ON L.COUNTRY_ID = C.COUNTRY_ID
JOIN EMPLOYEES M ON D.MANAGER_ID = M.EMPLOYEE_ID;

-- 11
SELECT D.DEPARTMENT_NAME, AVG(E.SALARY) AS AVERAGE_SALARY
FROM DEPARTMENTS D
JOIN EMPLOYEES E ON D.DEPARTMENT_ID = E.DEPARTMENT_ID
GROUP BY D.DEPARTMENT_NAME;