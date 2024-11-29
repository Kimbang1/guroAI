###########  D/N : SBP_Community 

create database SBP_Community;
use SBP_Community;

create table user(
num		int		auto_increment		,
userid	char(20)	unique		not null,
password	char(20)	not null,
email		char(30)	not null,
regTM		timestamp 	default now(),
constraint primary key(num)
);

select * from user order by num desc;