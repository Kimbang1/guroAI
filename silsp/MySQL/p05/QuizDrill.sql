###### comunity #######
create database comunity;
use comunity;

create table memberList(
seq				int				auto_increment 		unique key				,
name			char(10)															not null,
memID			char(20)															not null,
tel					char(15)																		,
regTM			timestamp									default now()				,
constraint		primary key(memID)
);

insert into memberList (name, memID, tel, regTM)
values
('바다','sea','010222333','2022-07-12'),
('망고','yellow','010555666','2022-08-29'),
('나무','tree','010888999',now());
select * from memberList;


# clubFee 테이블 구현
create table clubFee(
seq					int				auto_increment			,
memID				char(20)			not null					,
money				int					not null					,
payTM				timestamp		not null					,
constraint			primary key(seq)
);

insert into clubFee(memID, money, payTM)
values
('yellow',20000,'2023-01-05'),
('sea',20000,'2023-01-07'),
('sea',25000,'2023-02-06'),
('yellow',25000,'2023-02-10');

select * from clubFee order by seq asc;

#join 만들기
select clubFee.seq, memberList.name, clubFee.memID, clubFee.money, Date_format(payTM,'%y-%m-%d')as payTM
from memberList 
inner join clubFee on memberList.memID = clubFee.memID 
order by clubFee.seq desc;
