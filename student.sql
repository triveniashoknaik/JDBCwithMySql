use  student;
create table student1(rollno int, sname varchar(20));
desc student1;
insert into student1 values(3, 'rajani');
select * from student1;
select sname from student1 where rollno = '2';