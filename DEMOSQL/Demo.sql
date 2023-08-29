-- 22 Aug --
Use sys;  -- enter in the database
show tables;
CREATE TABLE TECHER (
id INTEGER NOT NULL AUTO_INCREMENT primary key,  -- Auto_increment
name VARCHAR(20) NOT NULL,
age NUMERIC(3) NOT NULL, -- NUMERIC means Integer
nationality VARCHAR(2) NOT NULL,
membership VARCHAR(1) NOT NULL

);

-- select Data from Table, * means all column
select * from TECHER;
select id, name, age from TECHER;
-- insert records 
-- All Column alias
insert into techer (id,name,age,nationality,membership) 
	value (1,'John',23,'HK','G');
    
insert into techer value (2,'Mary',24,'MU','F');
--
select * from techer;

CREATE TABLE STAFF (
id INTEGER NOT NULL AUTO_INCREMENT primary key,  -- Auto_increment
name VARCHAR(20) NOT NULL,
SALARY NUMERIC(10,2) -- NULLABLE, 8 digits goes to interger, 2 belongs to decimal


);
--
insert into staff (id,name,salary) 
	value (1,'John',10000.34);
insert into staff values (2,'Mary',null);
insert into staff (id,name) values(3,'Peter');

insert into staff (name,id,salary) 
	value ('Eric',4,10000.34);
    insert into staff (name,id,salary) 
	value ('Eric Cheung',5,20000.34);
--

-- UPDATE

update STAFF set salary = salary+ 1000;
--  select data by criteria
select * from STAFF;
select * from STAFF where id =1;
select * from STAFF where name = 'Eric' and salary > 5000;

select * from STAFF where name = 'John' or name = 'Mary';
select * from STAFF where name in ('John' , 'Mary') ; -- OR

-- Update from criteria
update staff set salary = salary * 1000 where id =4; -- old value is gone, and cannot backup

update staff 
set salary = salary +10,
name = 'Mary'
where name = 'Mary';



select id from STAFF;

-- UPDATE Column Name
select id , name as fullname, salary from staff;
-- Delete

Delete from Staff where id=5;
Delete from staff where id in(1,2); -- OR

-- Order By (Sorting)

select * from STAFF order by salary;-- default acceding order
select * from STAFF order by salary asc; -- same as above
select * from STAFF order by salary desc;

select * from STAFF order by salary asc, name desc;

-- sub quary
select max(salary) from staff;
select id from staff where salary = (select max(salary) from staff);
select id from staff where salary = (select min(salary) from staff);

update staff set salary = salary *0.9 where id = 
(select id from staff where salary = (select max(salary) from staff));

-- Function
select upper(name) as UPCASE from STAFF;
select lower(name) as LOWCASE from STAFF;
select avg(salary)as AVERAGE_STAFF from STAFF;

select * from STAFF where upper(name) = 'PETER';

-- Like

select * from STAFF where upper(name) like ' % PETER ' ;
-- % means any characher
select * from STAFF where upper(name) like '%PETER%' ;

select * from STAFF where upper(name) like '%PETER%'or name = 'Mary';
-- count()
select  count(*) from staff; -- 8
select count(1) from staff; -- 4

-- group by

select upper(name) as name, sum(salary) as name,
avg(salary) as AVG_SALARY,
max(salary) as MAX_SALARY,
min(salary) as MIN_SALARY
from STAFF
group by upper(name);


-- String operation

select	 * from staff where instr(name , 'chu') > 0;
select * from staff where length(name) > 10;
select  substring(name, 1,3) from staff;
select length(trim('testing something')) from dual;
select ltrim(' testing something') from dual;
select rtrim('testing something  ') from dial;
select concat(rtrim(' testing someting '),'ABC') from dual;
select replace('I Love Java' , 'Java','Python') from dual;


-- Case
UPDATE Salary
SET sex = CASE sex
        WHEN 'm' THEN 'f'
        WHEN 'f' THEN 'm'
        END;



-- 23 Aug  --

CREATE TABLE CUSTOMERS (
	ID INTEGER NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    EMAIL VARCHAR(50) NOT NULL,
    VIP VARCHAR(1) NOT NULL
    -- ORDER_ID INTEGER NOT NULL -- OPTION 2 -- Not a good option, 
);

-- ONE TO MANY (One customer may have many orders)
CREATE TABLE ORDERS (
	ID INTEGER NOT NULL,
    AMOUNT NUMERIC(9, 2) NOT NULL,
    CUSTOMER_ID INTEGER NOT NULL -- OPTION 1
);

CREATE TABLE ITEMS (
	ID INTEGER NOT NULL,
    AMOUNT NUMERIC(9, 2) NOT NULL,
    ORDER_ID INTEGER NOT null
);

Delete from CUSTOMERS;
Insert into CUSTOMERS values(1,'John','John@gmail.com','Y');
Insert into CUSTOMERS values(2,'Mary','mary@gmail.com','N');
Insert into CUSTOMERS values(3,'Eric','ERIC@gmail.com','N');

Delete from ORDERS;
Insert into ORDERS values(1,100.23,1);
Insert into ORDERS values(2,2000,1);
Insert into ORDERS values(3,1550,2);
Insert into ORDERS values(4,120,2);
Insert into ORDERS values(5,550,2);

-- ONE　KEY　TO　MANY
Delete from ITEMS;
Insert into ITEMS values(1,10,'APPLE',1);
Insert into ITEMS values(2,200,'Ipone',2);
Insert into ITEMS values(3,400,'IPAD',3);
Insert into ITEMS values(4,500,'ORANGE',3);
Insert into ITEMS values(5,5000,'LEMON',4);
Insert into ITEMS values(6,5000,'BOOK',5);
Insert into ITEMS values(7,50000,'BOTTLE',5);


select * from CUSTOMERS;
select * from ORDERS;

-- Join Table, Inner Join
Select O.ID as ORDER_ID ,
O.AMOUNT as ORDER_AMOUNT ,
O.CUSTOMER_ID as ORDER_ID,
C.NAME AS Customer_NAME,
I.DESCRIPTION as ITEM_DESC,
I.AMOUNT as ITEM_PRICE

From  CUSTOMERS C 
INNER JOIN ORDERS O  ON C.ID = O.CUSTOMER_ID
INNER JOIN ITEMS I ON I.ORDER_ID =O.ID
WHERE C.ID = 2
;

-- APPROACH 2:　INNER JOIN

Select O.ID as ORDER_ID ,
O.AMOUNT as ORDER_AMOUNT ,
O.CUSTOMER_ID as ORDER_ID,
C.NAME AS Customer_NAME,
I.DESCRIPTION as ITEM_DESC,
I.AMOUNT as ITEM_PRICE

From  CUSTOMERS C ,ORDERS O, ITEMS I
WHERE I.ORDER_ID = O.ID AND O.CUSTOMER_ID =C.ID
;

-- drop TABLE
CREATE TABLE ITEMS (
	ID INTEGER NOT NULL,
    AMOUNT NUMERIC(9, 2) NOT NULL,
    DESCRIPTION VARCHAR(100) NOT NULL,
    ORDER_ID INTEGER NOT NULL -- item have relationship with order instead of customer
);

-- LEFT　Join
Select O.AMOUNT as ORDER_AMOUNT ,
O.CUSTOMER_ID ,
C.NAME AS Customer_NAME,
C.ID

From  CUSTOMERS C LEFT JOIN ORDERS O ON O.CUSTOMER_ID = C.ID
;

-- Right Join
Select O.AMOUNT as ORDER_AMOUNT ,
O.CUSTOMER_ID ,
C.NAME AS Customer_NAME,
C.ID

From  CUSTOMERS C Right JOIN O.CUSTOMER_ID ON ORDERS  = C.ID
;


-- self-join

# SELECT wt1.Id 
# FROM Weather wt1, Weather wt2
# WHERE wt1.Temperature > wt2.Temperature AND 
#       TO_DAYS(wt1.recordDate)-TO_DAYS(wt2.recordDate)=1;


START transaction;
Select * from CUSTOMERS;
Insert into CUSTOMERS values(1,'ABC','BCD@gmail.com','Y');

rollback;
commit;

-- Primary Key
CREATE TABLE STUDENTS(
	ID INTEGER AUTO_INCREMENT,
	NAME VARCHAR(50),
    AGE NUMERIC (3),
	Primary Key(ID)
    
);

CREATE TABLE STUDENTS_SUBJECTS(
	ID INTEGER AUTO_INCREMENT,
    STUDENT_ID INTEGER NOT NULL,
    SUBJECT_ID INTEGER NOT NULL,
    Primary Key(ID),
    foreign key(STUDENT_ID) REFERENCES  STUDENT(ID),
    foreign key(SUBJECT_ID) REFERENCES  SUBJECTS(ID)
);

-- DDL
CREATE TABLE SUBJECTS(
	ID INTEGER AUTO_INCREMENT,
	NAME VARCHAR(50),
    primary key(ID)
);

-- DML
INSERT INTO　SUBJECTS (NAME) value('English');
INSERT INTO　SUBJECTS  (NAME) value('History');
INSERT INTO　SUBJECTS  (NAME) value('Maths');

INSERT INTO　STUDENTS_SUBJECTS  (STUDENT_ID, SUBJECT_ID) value(1,2);
INSERT INTO　STUDENTS_SUBJECTS  (STUDENT_ID, SUBJECT_ID) value(1,3);
INSERT INTO　STUDENTS_SUBJECTS  (STUDENT_ID, SUBJECT_ID) value(2,2);
INSERT INTO　STUDENTS_SUBJECTS  (STUDENT_ID, SUBJECT_ID) value(3,2);
INSERT INTO　STUDENTS_SUBJECTS  (STUDENT_ID, SUBJECT_ID) value(4,3);

-- ERROR, foreign Key constrant fails
INSERT INTO　STUDENTS_SUBJECTS  (STUDENT_ID, SUBJECT_ID) value(2,4);


-- TRUNCATE (Delete all data from table)

TRUNCATE TABLE STUDENT_SUBJECTS;
SELECT * FROM STUDENT_SUBJECTS;

-- alter ADD/COlumn (DDL)
ALTER TABLE STUDENTS ADD EMAIL VARCHAR(50);
ALTER TABLE STUDENTS DROP EMAIL;

-- ALTER　Column Definition
ALTER TABLE STUDENTS MODIFY EMAIL VARCHAR(60); -- ERROR if the Length Exceed THE DATA

-- ON DELETE CASCADE

CREATE TABLE DEPARTMENT(
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	DEPT_NAME VARCHAR(30) NOT NULL
	
);

INSERT INTO DEPARTMENT (DEPT_NAME) VALUES('CS');
INSERT INTO DEPARTMENT (DEPT_NAME)  VALUES('MARKETING');

-- ONE TO MANY;
CREATE TABLE COURSE(
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    COURSE_NAME VARCHAR(30) NOT NULL,
    COURSE_CODE VARCHAR(30) NOT NULL,
    DEPT_ID integer NOT NULL,
    foreign key (DEPT_ID) references DEPARTMENT(ID) -- ON delete cascade //  -- ON DELETE SET NULL
);

INSERT INTO COURSE(COURSE_NAME, COURSE_CODE, DEPT_ID) values ('Java', 'CS001', 1);
INSERT INTO COURSE(COURSE_NAME, COURSE_CODE, DEPT_ID) values ('THEORY', 'MT001', 2);

-- INSERT INTO COURSE(COURSE_NAME, COURSE_CODE, DEPT_ID) values ('THEORY', 'MT001', 3);

-- DELETE PARENT (DEPARTMENT)
Delete from Department where ID = 2; -- success
Delete from course where dept_ID = 2;

select * FROM Department;


ALTER TABLE course rename column Course_Name to Name;
ALTER TABLE course ADD column  START_DATE date Default '1900-01-01';
ALTER TABLE course ADD column  END_DATE date Default '1900-01-01';

ALTER TABLE course MODIFY column  END_DATE date Default '1900-01-01';

-- MODIFY AND DEFAULT
Insert INTO COURSE values ('THEORY', 'MT001', 3, null, null);
ALTER TABLE course MODIFY column  END_DATE date Default '1900-01-01 00:00:00';

-- Limit (ORDER BY)
Select * from Course ORDER BY ID limit 2;

-- OFFset
Select * from Course ORDER BY ID limit 1 offset 1; -- skip 1 row


-- Exit /Not Exit
INSERT INTO DEPARTMENT (DEPT_NAME) VALUES('ENG');
INSERT INTO DEPARTMENT (DEPT_NAME)  VALUES('CIVIL');

Select D.*
FROM DEPARTMENT D
Where not exists( -- CHECK if D.ID EXISTS IN CORSE 's DEPT_ID (CHECK ALL　ROWS)
	select 1
    from COURSE C
    WHERE C.DEPT_ID = D.ID
) 
-- AND NOT exists(
-- 	Select
-- )

-- EXISTS = Inner Join


-- 25 Aug 2023






