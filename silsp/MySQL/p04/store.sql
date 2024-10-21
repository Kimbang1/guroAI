##### D/N : store #####
## 테이블 참조관계의 이해

create database if not exists store;
# if not exists를 통해 database가 없다면, 만들어라라고 할 수 있다.
use store;

# 상품 재고 목록 테이블(goodsStock)
create table goodsStock (
no			int						,
goodsCode	char(20)	primary key	,
goodsName	char(30)				,
price 		int
);

# 상품 판매 내역 테이블(saleList)
create table saleList (
no			int						,
sellCode 	char(20)				,
sellCnt		int						,
sellPrice	int						,
sellTime	time					,
constraint foreign key(sellCode) references goodsStock(goodsCode)
);
# Error Code: 1824. Failed to open the referenced table 'goodsstock'
# reference로 사용할 테이블 goodsStock이 없는 상태에서는 참조를 하는 테이블을 생성할 수 없다.

# 선행입력
insert into goodsStock (no, goodsCode, goodsName, price)
values (1, 'test001', '좋은 상품', 5000);
select * from goodsStock;

# insert into T/N (C/N1, C/N2, ...) values (Data1, Data2, ...);
insert into saleList (no, sellCode, sellCnt, sellPrice, sellTime)
values (1, 'test001', 3, 15000, now());
# Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails
# (`store`.`salelist`, CONSTRAINT `salelist_ibfk_1` FOREIGN KEY (`sellCode`) REFERENCES `goodsstock` (`goodsCode`))
select * from goodsStock;
select * from saleList;


### quiz 풀이 ###
set sql_safe_updates=0;
delete from saleList;
delete from goodsStock;

insert into goodsStock values
(1, 'C001', '아메리카노', 3500),
(2, 'T002', '레몬티', 3000),
(3, 'F003', '샌드위치', 4000);

insert into saleList values
(1, 'C001', 2, 7000, '2021-07-13 09:15'),
(2, 'F003', 2, 8000, '2021-07-13 09:15'),
(3, 'C001', 1, 3500, '2021-07-13 09:40'),
(4, 'T002', 1, 3000, '2021-07-13 10:27'),
(5, 'C001', 4, 14000, '2021-07-13 10:53'),
(6, 'F003', 3, 12000, '2021-07-13 10:53');

select * from goodsStock order by no desc;
select * from saleList order by no desc;

### 선생님 풀이 ###
drop table goodsStock; 		# A. 기준 테이블
# Error Code: 3730. Cannot drop table 'goodsstock' referenced by a foreign key constraint
# 'salelist_ibfk_1' on table 'salelist'.
# 참조관계의 기준이 되는 테이블을 먼저 삭제할 수 없음. 즉, goodsStock이 saleList가 남아있는 상태에서 삭제할 수 없다.
# 그러므로 saleList 테이블을 먼저 삭제해야 한다.

drop table saleList;		# B. 참조하는 테이블

insert into goodsStock values
(1, 'C001', '아메리카노', 3500),
(2, 'T002', '레몬티', 3000),
(3, 'F003', '샌드위치', 4000);

select * from goodsStock order by no desc;

insert into saleList values
(1, 'C001', 2, 7000, now()),
(2, 'F003', 2, 8000, now()),
(3, 'C001', 1, 3500, now()),
(4, 'T002', 1, 3000, now()),
(5, 'C001', 4, 14000, now()),
(6, 'F003', 3, 12000, now());
select * from saleList order by no desc;

# Join(조인) : 2개 테이블의 병렬결합 조회(Select)

# 왼쪽 테이블 : goodsStock (상품 재고 테이블)
select * from goodsStock;

# 오른쪽 테이블 : saleList (상품 판매 테이블)
select * from saleList;

# Cross Join(= 카타시안 결합)
select * from goodsStock, saleList;
select count(*) from goodsStock, saleList;

#Inner Join(크로스 조인에서 공통으로 일치하는 자료의 결합)
# 2개의 테이블에서 공통자료를 갖는 컬럼을 조건으로 지정함.
select * from goodsStock inner join saleList
on goodsStock.goodsCode = saleList.sellCode;

select no from goodsStock inner join saleList
on goodsStock.goodsCode = saleList.sellCode;
# Error Code: 1052. Column 'no' in field list is ambiguous(애매모호하다 -> 두 테이블에 no가 다 들어있음)

select saleList.no, goodsName, goodsCode, price '단가', sellCnt as '수량', sellPrice '결제액', sellTime as '판매시간'
from goodsStock inner join saleList on goodsStock.goodsCode = saleList.sellCode order by saleList.no;

select s.no, goodsName, goodsCode, price '단가', sellCnt as '수량', sellPrice '결제액', sellTime as '판매시간'
from goodsStock g inner join saleList s on g.goodsCode = s.sellCode order by s.no;


################# Union #################
create table goodsList (
no 			int			,
gCode 		char(20) 	,
gName 		char(30) 	,
count 		int 		,
constraint primary key(gCode)
);

insert into goodsList values
(1, 'A005', '운동화', 5),
(2, 'B003', '화장품', 9),
(3, 'C002', '카메라', 2),
(4, 'D007', '피자', 16);
select * from goodsList order by no desc;

create table product (
num			int			,
pCode		char(20) 	,
pName 		char(30)	,
saleVol 	int			,
price		int			,
constraint primary key(pCode)
);

insert into product values
(1, 'A041', '모자', 3, 7000),
(2, 'B003', '화장품', 14, 8000),
(3, 'D007', '피자', 26, 3500);
select * from product order by num desc;

select no, gCode, gName from goodsList
union
select num, pCode, pName from product;

select no, gCode, gName from goodsList
union all
select num, pCode, pName from product;

################# View(뷰) #################
# view는 select 문에서만 적용됨.
# 뷰 형식
# create view V/N as 뷰로 지정할 Select 문;

# view 생성( = 뷰 정의)
create view saleResult as
select s.no, goodsName, goodsCode, price '단가', sellCnt as '수량', sellPrice '결제액', sellTime as '판매시간'
from goodsStock g inner join saleList s on g.goodsCode = s.sellCode order by s.no;

drop view saleResult;

# view 결과보기
# 형식 select * from V/N;
select * from saleResult;

# 뷰 제거 후 조회하면 아래와 같은 오류 발생
# Error Code: 1146. Table 'store.saleresult' doesn't exist

show tables;

show index from goodsList;

