create database studentD;
use studentD;
create table studentD(Name varchar(20),rollNo varchar(30),email varchar(30),password varchar(20));
select * from studentD;
drop table studentD;

create table questions(question_id int,question varchar(100),option1 varchar(40),option2 varchar(40),option3 varchar(40),option4 varchar(40),correct_answer varchar(10));
create table user_answers(rollNo varchar(20),question_id int,user_answer varchar(20));
create table grades(rollNo varchar(20),grade double);

select *from grades;
select *from user_answers;

drop table grades;
drop table user_answers;

insert into questions values(1,'Who invented Java Programming?','a. Guido van Rossum','b. James Gosling','c. Dennis Ritchie','d. Bjarne Stroustrup','b'),
(2,'Multiline comment is created using____','a.//','b./* */','c.<!--  -- >','d.All of these','b'),
(3,'What is the entry point of a program in Java?','a.main() method','b.The first line of code','c.Last line of code','d.main class','a'),
(4,'Which keyword in java is used for exception handling?','a. exep','b. excepHand','c. throw','d. All of these ','c'),
(5,'what is Runnable?','a. abstract class','b. interface','c. class','d. method','d'),
(6,'Which of the following is the correct syntax to create a variable in Java?','a. var name;','b. int name;','c. var name int;','d. All of these','b'),
(7,'Object in java are ___.','a.Classes','b. References','c. Iterators','d. None of the above','b'),
(8,'The correct syntax to import the math library in java is ___.','a. import java.lang.math','b. import math','c. import java.math','d. All of these','a'),
(9,'Method used to take a string as input in Java?','a. next()','b. nextLine','c. Both A & B','d. None of these','c'),
(10,'Which class in Java is used to take input from the user?','a. Scanner','b. Input','c. Applier','d. None of these','a');

select *from questions;


