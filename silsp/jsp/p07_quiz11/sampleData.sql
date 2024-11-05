##### D/N sampleData ######

create database sampleData;
use sampleData;

create table goodsList(
num			int				auto_increment			,
goodsCode	char(20)					,
goodsName	char(20)						not null,
price		int										,
cnt			int,
 primary key(goodsCode),
 unique(num)
);

drop table goodsList;
desc goodsList;

select * from goodsList order by num asc;