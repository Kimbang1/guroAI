##### D/N : company ######

create database company;
use company;

create table staffList(
num 				int				not null			,
id					char(10)								,
name 			char(10)		not null			,
age				int										,
address		char(50)		not null			,	
constraint primary key(id)
); 
desc staffList;

insert into staffList values
(3, 'lebin', '레몬', 41, '대전시 중구');


select *from staffList order by num desc;

update staffList set
age = 30
where id ='guset';

set sql_safe_updates = 0;
delete from staffList where num = 1;
