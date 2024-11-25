################## D/N: db_Service

create database  db_Service;
use db_Service;

create table board(
num		int		primary key		auto_increment,
writer	char(30)	not	null	,
title 	char(100)	not	null	,
content	char(200)	
);

desc table board;

insert into board(writer,title, content)
values
('테스터01','연습글 1번','1번글 내용입니다.'),
('테스터02','연습글 2번','2번글 내용입니다.');

select * from board;