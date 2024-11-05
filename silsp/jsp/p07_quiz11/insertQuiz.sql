###### D/N insertQuiz######

create database insertQuiz;
use insertQuiz;

create table bbs(
num			int			auto_increment				,
title		char(50)						not null,
content		char(250)								,
writer		char(20)						not null,
regTm					timestamp			default now(),
constraint	primary key(num)
);
desc bbs;

select *from bbs order by num asc;
