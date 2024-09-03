connect manager01;
--테이블 생성
create table staff(
num     number(4)   unique not null ,
userid   nchar(20)   not null        ,
username nchar(20)  not null        ,
yearRank    number(2) default 0  null   ,
position    nchar(30)   null    ,
constraint staff_pk primary key(userid, username)
);

create sequence staffSeq
start with 1
increment by 1;

desc staff;
commit;

insert into staff
(num, userid, username, yearRank, position)
values
(staffSeq.nextval, 'hy_Ahn', '안혜영', 5, '과장');


insert into staff
(num, userid, username, yearRank, position)
values
(staffSeq.nextval, 'jk_Heo', '허진군', 3, '대리');

SELECT * FROM staff;
select*from staff order by num desc;

update staff set position = '실장' where userid =  'hy_Ahn';

set autocommit on;
set autocommit off;
show autocommit;



commit;

-- sqlplus 에서는 insert, updatem delete 명령을 시행한 후
-- DB 최종반영된다.(autocommit 속성이 기본  true; 적용 . 즉, autocommit omn);
-- sqlDeeloper 에서는 insert, updatem delet 명령을실행한 후
--