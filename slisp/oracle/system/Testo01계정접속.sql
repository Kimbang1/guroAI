create table goodsList(
num     number(3)       unique
,

code        varchar(20)        ,        
name        varchar(20)            ,
price       number(7)      default 0    ,
opt     nchar(20)                       ,
makedate        date        default sysdate,
constraint goodsList_pk PRIMARY key(code)
);




--시퀀스 생성(=번호 컬럼 자동증가)
create sequence goodsList_seq
start with 1
increment by 1;

-- 수정 쿼리
-- update T/N set 수정할 C/N = 수정할 값 where code =' ';

-- 수정할 경우 전체데이터의 수정이 아니라면
--where 조건절을 반드시 사용한다. 


--삭제 쿼리
--delete from T/N ; 전체 데이터 삭제
--delete from T/N where 대상C/N= 데이터;


drop sequence goodsList_seq;
drop table goodsList; --테이블 삭제
commit;

insert into goodsList(name, code,num, price)
values ('키보드' ,'keyboard', 7,34000 );

insert into goodsList(num, code, name, price, opt, makedate)
values(goodsList_seq.nextval, 'mouse', '마우스', 13000, '버티컬','20231009');
insert into goodsList     
values(goodsList_seq.nextval, 'stick', '막대기', 14000, '갈색','20240813');

select *from goodsList where name='휴대폰';    -- 조건 조회, 조건 검색
select *from goodsList where code like '%a%';          --부분문자열 조건검색
                                                        --대표문자, Wild card(와일드 카드)
                                                        
select count(*)from goodsList where code like '%a%';          --조회된 자료의 전체 개수 확인
select * from goodsList where price<30000;         ---가격이 (price)3만원 미만인 상품결제            
select * from goodsList where price<30000 order by price desc;         --- 조건을 지정한 정렬=> where 먼저 설정 후 order by 적용
                                              -- 가격이 (price)이 3만원 미만인상품의 내림차순 검색
select * from goodslist goodsList where price>=30000 and price<50000;    --4만원대 상품 검색(30000원 이상 50000원 미만)

--연속구간 : && 2만원 이상 3만원 이하
-- => and 조건 그리고 조건
--분산구간 : || 2만원 미만 3만원 이상
--=> or조건, 또는 조건

select *from goodsList order by num; --asc, 오름차순, 기본적용 속성값
select *from goodsList;
select *from goodsList order by num desc; --desc, 내림차순
select * from goodslist goodsList where price>=30000 and price<50000;    --4만원대 상품 검색(30000원 이상 50000원 미만)

--연속구간 : && 2만원 이상 3만원 이하
-- => and 조건 그리고 조건
--분산구간 : || 2만원 미만 3만원 이상
--=> or조건, 또는 조건

select *from goodsList order by num; --asc, 오름차순, 기본적용 속성값

select *from goodsList where price between 30000 and 49999;
select price, name 이름, num 번호 from goodsList;
desc goodsList;

select num, code, name, price, opt, makedate from goodsList order by num desc;

select*from user_tables;


--시퀀스 = 자동증가 속성