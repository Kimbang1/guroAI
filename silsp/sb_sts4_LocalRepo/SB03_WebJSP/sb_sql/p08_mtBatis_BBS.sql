#########D/N :mtBatis_BBS

create database mtBatis_BBS;
use mtBatis_BBS;

create table board(
num 	int		auto_increment	primary key	,
writer	char(30)	not null	,
title	char(30)	not null	,
content	char(255)	
);


drop table board;