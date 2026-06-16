create database Emp;
use Emp;
create table emp_data(id int not null,name varchar(30),designation varchar(40),exp int, age int);
insert into emp_data(id,name,designation,exp,age)values(1,"swapnil","HR",4,21);
insert into emp_data(id,name,designation,exp,age)values(2,"Om","manager",2,20);
select * from emp_data;	
select * from emp_data where id=1;
delete from emp_data where id=1;

ALTER TABLE emp_data
ADD PRIMARY KEY (id);

update emp_data set name="vijay",designation="java",exp=2,age=20 where id=1;