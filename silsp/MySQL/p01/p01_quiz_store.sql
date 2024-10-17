create database orderList;

use orderList;

create table orderList(
num 		int		primary key		,
item		char(30)	not null		,
unitPrice	int		null				,
price			int		null				,
cnt			int		null				
);

select *from orderList;

insert into orderList values(1, '햄버거', 6000, 12000, 2);
insert into orderList values(2, '피자', 21000, 21000, 1);
insert into orderList values(3, '커피', 2500, 7500, 3);