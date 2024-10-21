##### shopingMall #####

create database shoppingmall;
use shoppingmall;

#쇼핑 상품목록 테이블
create table productlist(
seq				int			not null 		auto_increment		unique	,
productCode	char(30)	not null													,
productName char(10)																	,
stockVol		int																			,
pDate			char(20)																	,
personCharge	char(20)																,
sellPrice		int						default	0										,
constraint primary key(productCode)
);

select * from productlist;		#변경전
select * from store;		#변경후

#테이블명 변경
alter table productlist rename to store;

#테이블 수정사항alter
#1. 필드명 변경
alter table store change productCode pCode INT;
alter table store change pCode pCode char(30);


#2.필드명, 자료형 변경
alter table store change productName pName char(30);

#3.자료형 변경
alter table store modify pDate datetime;

#4.5.6.필드 추가
alter table store 
add pCost int,
add gType char(30),
add salesVol int;

#7.필드 삭제
alter table store drop column personCharge;

describe store;

#자료 입력
INSERT INTO store (pCode, pName, stockVol, salesVol, pDate, sellPrice, pCost, gType) VALUES
('F257', '삼겹살', 52, 71, '2020-03-11', 6400, 4800, 'Food'),
('D105', '썬크림', 30, 104, '2020-02-24', NULL, 5200, 'Daily'),
('P30', '보급형 휴대폰', 5, 7, '2020-12-27', 360000, 470000, 'Phone'),
('P70', '폴더블 폰', 2, 2, '2020-03-04', 1325000, 119000, 'Phone'),
('F330', '생수', 61, 242, '2020-02-26', 7800, 6100, 'Food'),
('C45', '발목양말', 27, 11, '2020-11-30', 1500, 840, 'Wear'),
('F647', '라면', 260, 193, '2020-02-25', 4150, 3300, 'Food'),
('D002', '치약', 23, 0, '2020-01-09', 0, 0, NULL),
('D913', '키친타월', 46, 15, '2020-12-14', 4580, 2900, 'Daily'),
('D854', '핸드크림', 9, 3, '2020-07-08', 5000, 5000, 'Daily');

#5-1 전체 잘에서 판매가 필드와 분류 필드에 NULL이 입력되어 있는 자료만 조회하세요.
select seq, pCode, pName, stockVol, gType
from store
where sellPrice is null or gType is null;

#5-2 상품코드 D105이 썬크림이 판매가를 8500원으로 수정하시오
set sql_safe_updates =0;
set autocommit=0;
commit;

update store
set sellPrice = 8500
where pCode = 'D105';


#5-3 상품코드 D002, 상품명 치약의 데이터를 수정하시오
update store
set salesVol =54, stockVol = 30, sellPrice = 5900, pCost=3400, gType = 'Daily'
where pCode='D002';

#5-4전체데이터에서 판매량의 내림차순으로 상위 3개의 데이터만 조회하세요.
select* from store
order by salesVol desc
limit 3;

#5-5상품분류 컬럼에서 상품의 종류를 중복하지 않고 1개씩 조회하세요.
# 단, 분류필드만 존재합니다.
select distinct gType
from store;

#5-6전체 데이터를 상품 분류의 오름차순,동일한 분류 내에서 재고량 내림차순으로 정렬
select*from store
order by gType asc, stockVol desc;

#5-7 상품코드에서 D,F를 포함하는자료 조회
select*from store
where pCode like'D%'|| pCode like'F%';

#5-8재고량이 30개 이하인 모든 상품을 조회하세요
select*from store
where stockVol<=30;

#5-9 상품명이 '삼겹살'인 제품의 상품코드와 생산일 변경
update store
set pCode='F412', pDate='2020-03-21'
where pName='삼겹살';

#5-10 상품분류에서 'Food'에 해당하는 상품들중에서 최대 판매량 제품과 최소판매량 제품을 조회하세요.
(select *from store
where gType = 'Food'
order by salesVol desc
limit 1)
UNION ALL
(select*from store
where gType ='Food'
order by salesVol asc
limit 1);