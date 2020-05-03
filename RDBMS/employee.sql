show databases;
create database employee;
use employee;
create table EMPLOYEE_TAB(EMP_ID varchar(9) NOT NULL primary key,EMP_NAME varchar(40) NOT NULL,EMP_ST_ADDR varchar(20) NOT NULL,SALARY NUMERIC,DATE_HIRED DATE);
desc EMPLOYEE_TAB;
insert into EMPLOYEE_TAB values ('001','Shelly','AGRA',150,'2010-02-02');
SELECT CURTIME(), CURTIME()+0;
select * from EMPLOYEE_TAB;
alter table EMPLOYEE_TAB add column EMP_PHONE INTEGER;
alter table EMPLOYEE_TAB modify EMP_ST_ADDR varchar(25) NULL;
select max(salary) from EMPLOYEE_TAB;
insert into EMPLOYEE_TAB(EMP_ID,EMP_NAME) values ('002','Deepak');
select IFNULL(EMP_ST_ADDR,'hehe') from EMPLOYEE_TAB; -- NVL used in Oracle here
update EMPLOYEE_TAB set salary=2 where EMP_ID='002';
SELECT DISTINCT(salary) FROM EMPLOYEE_TAB ORDER BY salary DESC LIMIT 1,1;
# SELECT DISTINCT(salary) FROM employee ORDER BY salary DESC LIMIT n-1,1
#So, if you want to find out the 7th largest salary, consider the below query.
#SELECT DISTINCT(salary) FROM employee ORDER BY salary DESC LIMIT 6,1 
savepoint sp1;
update EMPLOYEE_TAB set EMP_ST_ADDR="Chennai1" where EMP_ID='002';
update EMPLOYEE_TAB set salary=999 where EMP_ID='002';
rollback to sp1;
select * from EMPLOYEE_TAB;
commit;