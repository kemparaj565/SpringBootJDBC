drop table person if exists;
drop table employee if exists;

create table Person(Person_Name varchar2(55),Person_Age integer,Person_EmpID integer);
create table Employee(Employee_Name varchar2(55),Employee_Age integer,Employee_ID integer,Employee_Dept varchar2(15));