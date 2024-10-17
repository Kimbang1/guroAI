create database product;

use product;

create table goodsList(
num		int		primary key		,
code	char(5)		not null		,
name	char(30)	not null		,
price		int			null				,
maker	char(20)	null				,
cnt		int			null				,
mfg		date					
);

select *from goodsList;

alter table goodsList
modify column mfg date;
insert into goodsList values(1, 'A001', '디지털TV', 520000, '제일', 7, '2016-04-27');
insert into goodsList values(2, 'A002', 'DVD', 240000, '제일', 4, '2016-06-08');
insert into goodsList values(3, 'U101', 'DSLR', 830000, '우수', 8, '2016-12-19');
insert into goodsList values(4, 'U102', '전자사전', 160000, '우수', 3, '2016-11-30');
insert into goodsList values(5, 'H704', '전자렌지', 90000, '하나', 11, '2016-02-15');