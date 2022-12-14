CREATE TABLE ARUNPANDI_EMPLOYEES
(
ID INT PRIMARY KEY,
FIRST_NAME VARCHAR(40),
LAST_NAME VARCHAR(40),
SALARY DECIMAL(8,2),
DEPARTMENT_ID INT,
YEAR_OF_JOINING DATETIME,
YEAR_OF_RELIEVING DATETIME
)

INSERT INTO ARUNPANDI_EMPLOYEES
(ID,FIRST_NAME ,LAST_NAME ,SALARY ,DEPARTMENT_ID ,YEAR_OF_JOINING,YEAR_OF_RELIEVING )
VALUES
(1,'Ranjith','Kumar',40000 , 5,'5/29/2005','03/22/2022')

,(2,'Selva','Durai', 30000, 3,'07/09/2016','1/08/2020')
,(3,'Rahul','Subburaj', 35000, 5,'07/09/2016','1/08/2020')
,(4,'Sathish','Kumar', 33000, 2,'07/09/2016','1/08/2020'),
(5,'Punitha','Arun', 30000, 3,'03/19/2018','02/10/2021'),(6,'Sandiya','Kumar', 15000, 2,'04/19/2009','05/8/2012'),(7,'Surya','Prakash', 45000, 4,'06/19/2019','05/8/2012'),(8,'Arun','Kumar', 55000, 3,'07/20/2013','10/6/2015'),(9,'Sathya','priya', 10000, 5,'06/9/2020','11/21/2022'),(10,'Keerthi',' Balan', 18000, 2,'2/25/2013','01/28/2018'),
(11,'Ganesh','Pandiyan', 30000, 4,'07/09/2016','1/08/2020'),(12,'Saranya','Saran', 12000, 4,'07/09/2016','1/08/2020'),(13,null,null, 20000, 4,'07/09/2016','1/08/2020')


select * from ARUNPANDI_EMPLOYEES


CREATE TABLE ARUNPANDI_DEPARTMENTS
(
DEPARTMENT_ID INT PRIMARY KEY,
MANAGER_ID INT,
DEPARTMENT_NAME VARCHAR(50)
)

insert into  ARUNPANDI_DEPARTMENTS (DEPARTMENT_ID ,MANAGER_ID ,DEPARTMENT_NAME )
values
(1,2,'CEO'),(2,1,'DEVELOPER'),(3,4,'FINANCE'),(4,7,'TESTING'),(5,9,'HR'),(6,6,'ADMIN')

select * from ARUNPANDI_DEPARTMENTS 





--1)
select FIRST_NAME,LAST_NAME from ARUNPANDI_EMPLOYEES where FIRST_NAME like 'S%'
--2)
select FIRST_NAME,LAST_NAME from ARUNPANDI_EMPLOYEES where FIRST_NAME  like 'S%n' 
--3)
select FIRST_NAME,LAST_NAME from ARUNPANDI_EMPLOYEES as a
 where a.DEPARTMENT_ID=2 and FIRST_NAME like'S%'
 --4)
 select DEPARTMENT_ID from ARUNPANDI_EMPLOYEES   where DEPARTMENT_ID like'_2%' 

 --5)
 select FIRST_NAME,LAST_NAME from ARUNPANDI_EMPLOYEES where DEPARTMENT_ID in (1,2,5)
 --6)
 select FIRST_NAME,LAST_NAME ,SALARY from ARUNPANDI_EMPLOYEES where SALARY between 10000 and 15000
 --7)
  select FIRST_NAME,LAST_NAME ,SALARY,a.DEPARTMENT_ID ,d.MANAGER_ID  from ARUNPANDI_EMPLOYEES as a ,ARUNPANDI_DEPARTMENTS as d where d.MANAGER_ID is  null
  --8)
  select * from ARUNPANDI_EMPLOYEES  order by FIRST_NAME  asc
  --9)
  select * from ARUNPANDI_EMPLOYEES  order by DEPARTMENT_ID  asc ,  SALARY desc;
  --10)
  select substring(FIRST_NAME,1,3) from ARUNPANDI_EMPLOYEES 
   --11)
  select Right(LAST_NAME,2) from  ARUNPANDI_EMPLOYEES where YEAR_OF_JOINING between '01/01/2010' and '12/31/2022'
  
  --12)
  select FIRST_NAME ,charindex('a',FIRST_NAME) as position from ARUNPANDI_EMPLOYEES 
  --13)
  select max(SALARY) from ARUNPANDI_EMPLOYEES
  --14)
  select max(SALARY) from ARUNPANDI_EMPLOYEES WHERE SALARY < (select max(SALARY) from  ARUNPANDI_EMPLOYEES) 
  --15)
  select avg(SALARY) from ARUNPANDI_EMPLOYEES where DEPARTMENT_ID=3
  --16)
  select YEAR_OF_JOINING, count(*) from ARUNPANDI_EMPLOYEES where DEPARTMENT_ID =3 group by YEAR_OF_JOINING 
  --17)
  select avg(SALARY)as avg_salary from ARUNPANDI_EMPLOYEES where YEAR_OF_JOINING < getdate()
  --18)
  select month(YEAR_OF_JOINING) as month_of_joining from ARUNPANDI_EMPLOYEES group by month(YEAR_OF_JOINING) having count(ID)>5
  --19)
   select LAST_NAME from ARUNPANDI_EMPLOYEES where YEAR_OF_JOINING between '01/01/2010' and '12/31/2022'
  --20)
  select distinct year(YEAR_OF_JOINING) from ARUNPANDI_EMPLOYEES  group by year(YEAR_OF_JOINING) having count(ID) >2
    --21)
select ID  from ARUNPANDI_EMPLOYEES where SALARY >(select avg(SALARY) from ARUNPANDI_EMPLOYEES)
  --22)
  select datediff(day,YEAR_OF_JOINING,YEAR_OF_RELIEVING), FIRST_NAME from  ARUNPANDI_EMPLOYEES 

  --23)
  select distinct year(YEAR_OF_JOINING) ,FIRST_NAME from ARUNPANDI_EMPLOYEES  order by year(YEAR_OF_JOINING) 

  --24)  
 select upper(FIRST_NAME)as first_name,lower(LAST_NAME)as last_name from ARUNPANDI_EMPLOYEES
 --25)
 select len(FIRST_NAME) as lengthofname,FIRST_NAME, LAST_NAME from ARUNPANDI_EMPLOYEES where LAST_NAME like '__b%'
  --26)
    select datediff(year,YEAR_OF_JOINING,YEAR_OF_RELIEVING) as Experience , FIRST_NAME from  ARUNPANDI_EMPLOYEES 
 --27)
  select FIRST_NAME,LAST_NAME from ARUNPANDI_EMPLOYEES where month(YEAR_OF_JOINING) = 5 
  --28)
  select ID,FIRST_NAME,LAST_NAME from ARUNPANDI_EMPLOYEES where SALARY >(select avg(SALARY) from ARUNPANDI_EMPLOYEES)
  --29
  A primary key is the column or columns that contain values that uniquely identify each row in a table
CREATE TABLE ARUNPANDI_EMPLOYEES
(
ID INT PRIMARY KEY,
FIRST_NAME VARCHAR(40),
LAST_NAME VARCHAR(40),
SALARY DECIMAL(8,2),
DEPARTMENT_ID INT,
YEAR_OF_JOINING DATETIME,
YEAR_OF_RELIEVING DATETIME
)

A foreign key is a column of data in one table that refers to the primary key data in another table.

CREATE TABLE ARUNPANDI_DEPARTMENTS
(
DEPARTMENT_ID INT PRIMARY KEY,
MANAGER_ID INT,
DEPARTMENT_NAME VARCHAR(50)
)

  
  --30)
 update    ARUNPANDI_EMPLOYEES set LAST_NAME='AAA' ,set FRST_NAME='AAA' where LAST_NAME ,FRST_NAME IS NULL
 --31)
 create view ARUN_VIEW as select ID,FIRST_NAME,LAST_NAME,a.DEPARTMENT_ID,DEPARTMENT_NAME from  ARUNPANDI_EMPLOYEES as a inner join  ARUNPANDI_DEPARTMENTS as d
 on d.DEPARTMENT_ID=a.DEPARTMENT_ID ;

--32)
 create synonym ARUNPANDI_SYN for ARUN_EMPLOYEES 
 
--33)
create procedure ARUNPANDI_PROCEDURE 
as
select * from ARUNPANDI_EMPLOYEES where YEAR_OF_JOINING between '1/1/2010' and '12/31/2022'
Go

exec ARUNPANDI_PROCEDURE
--34) 
create procedure ARUNPANDI_INSERT
as
insert into  ARUNPANDI_DEPARTMENTS (DEPARTMENT_ID ,MANAGER_ID ,DEPARTMENT_NAME )
values
(6,2,'HR')
go

exec ARUNPANDI_INSERT

--35)
select replace(convert(varchar,'2006-12-30',101),'-','') + replace(convert(varchar,' 00:38:54' ,108),':','');	
