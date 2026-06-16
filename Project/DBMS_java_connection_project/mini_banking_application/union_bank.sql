create database Union_bank;
use Union_bank;

drop table customer;
truncate table customer;

create table customer(account_no int auto_increment primary key,cname varchar(20),balance int, password varchar(10));
insert into customer(cname,balance,password)values("swapnil",1000,"1234");
select *from customer;
select cname,password from customer where cname="swapnil" && password="1234";
select * from customer where account_no=1;
select balance from customer where account_no=1;
update customer set balance=balance+1000 where account_no=1;
update customer set balance=balance-200 where account_no=1;

