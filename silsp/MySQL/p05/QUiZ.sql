			###### quiz_store ######

create database quiz_store;
use quiz_store;

#테이블 명세
create table orderList(
num					int							,
item					char(30)			not null,
uniPrice				int								,
price					int								,
cnt					int								,
constraint primary key(num)
);

insert into orderlist(num,item, uniPrice, price, cnt)
values	
(1,'햄버거',6000,12000,2),
(2,'피자',21000,21000,1),
(3,'커피',2500,7500,3);

select *from orderlist order by num desc;