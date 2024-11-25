################   D/N : shopManager	#######

create database shopManager;
use shopManager;

drop table goodsList;
create table goodsList(
num  		int		auto_increment			,
goodsName  	char(20)				not null,
goodsCode	char(20)						,
price		int								,
cnt 		int						not null,
regTM		timestamp				default now(),
constraint unique key(num),
primary key(goodsCode)
);


desc goodsList;
select * from goodsList order by num desc;