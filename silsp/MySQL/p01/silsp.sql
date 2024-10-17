create database school;

use school;
-- 주석
#주석
create table student (
num 		int 				not null 		,
id 			char(10) 		primary key 		,				#not null, 중복금지 = primary key
name 	char(10)		not null		,
age		int				null				,
adress	char(50)		not null
);

#describe T/N;
describe student;			-- desc student;

#자료입력
#insert into T/N (C/N1,C/N2,....) values (Data1, Data2, ...);
insert into student (num, id, age, name, adress) 
values(1, 'tester01', 17, '테스터01', '경기도 남양주시');

insert into student (num, id, age, name, adress) 
values(2, 'banana', 23, '바나나', '서울 상봉동');

#자료수정,삭제 하기전 설정
set sql_safe_updates=0;

desc student;
select *from student;
#수정하는 방법
#update T/N set 수정할C/N1=수정할Data1, 수정할C/N2=수정할Data2 
update student set age=17 where num=2;
#										-------------- 조건절

#자료조회
select num, id, name, age, adress from student;
select *from student;

#0.현재 MySQL의 데이터 베이스 목록 보기
# => show tables;

#1. 데이터베아스 생성
#create database D/N;
#참고. DB 삭제 =>drop

#현재 DB의 테이블 목록 보기
#	=> show tables;

#2.사용할 데이터베이스 지정
# 	use D/N;

#3. 테이블 생성
#create table T/N(
#C/N1			D/t(L)		[Constraint]   ,
#C/N2			D/t(L)		[Constraint]   ,
#	...........											,
#[Constraint]
#);
#D/T => int, char(개수) 
#Constraint(컨스트레인트, 제약조건)
#=> null/not null, primary key, unique 
#auto-increment	자동증가 속성
# default			기본값 속성


#		자료의  CRUD 관련 내용(Insert, Select, Update, Delete)
#  테이블의 명세(=구조 보기)
#		desc T/N; 또는 describe T/N;

#	생성된 테이블 삭제
#	drop table T/N;	(만일 참조키 설정이 되어있고
#							실제 데이터가 있다면 삭제안됨.
#							데이터 삭제후 테이블 제거 가능)

#4.자료의 입력
#		insert into T/N (C/N1, C/N2 ......)
#		values (Data1, Data2,.....);
#	컬럼의 개수와 입력 값의 개수는 동일해야 함

#	모든 컬럼의 자료를 입력할 경우
#  컬럼명을 생략할 수 있음.
#	insert into T/N values (Data1,Data2...);
#단,desc T/N; 명령을 실행했을 때의
# 컬럼 순서대로 자료를 입력해야 함.

#5. 자료의 조회
# select C/N1, C/N2, .... from T/N;
# select*from T/N;
# *=> all
# 	특정 자료의 조회
#	
#

#6.자료의 수정, 삭제
#  먼저 set sql_safe_updates=0;		실행

# 1)전체 자료의 수정
# update T/N set 수정할 C/N1=수정할Data1,
#						  수정할 C/N2=수정할Data2			
#						....;

# 2)특정 자료의 수정
# update T/N set 수정할 C/N1=수정할Data1,
#						  수정할 C/N2=수정할Data2			
#						....
#						where 특정C/N = 특정Data;
#where 조건절 또는 부속절				특정 자료만 수정됨

# 3)전체 자료의 삭제
#  delete from T/N;

# 4)특정 자료의 삭제
#  delete from T/N where 특정C/N=특정Data;


show databases;
use school;
show tables;
desc student;

select * from student;
select num, name, age, id from student;
select *from student where id = 'lemon';

insert into student values (3, 'sky','하늘', 37,  '대전시');



#출력결과는 PK 오름차순이 자동적용된다.
#참고, PK: 프라이머리 키, 기본키, 쿼리작성에서는 반드시 primary key
#PK 자동출력방식이 아닌 수동으로 정렬을 지정

# 오름차순 정렬
#  select C/N1, ....from T/N order by 정렬할 컬럼 asc;
# 단 , asc가 기본값이므로 생략가능
#  select C/N1, ....from T/N order by 정렬할 컬럼;

# 내림차순 정렬
#  select C/N1, ....from T/N order by 정렬할 컬럼 desc;


select * from student order by name;
select * from student order by num asc;
select * from student order by adress desc;

# 테스터01 =>나무

select *from student;
update student set name='나무' where id='tester01';

insert into student values(2, 'banana', '바나나',23,  '서울 상봉동');
set sql_safe_updates=1;

delete from sutdent where num=2;
delete from student where id='banana';
rollback;