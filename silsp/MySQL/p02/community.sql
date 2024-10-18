###### D/N : community #####

drop database community;
create database community;
use community;

create table bbs_TBL(
no				int 					auto_increment,
writerID			char(30)			not null,
articleTitle		char(50)			not null,
readCnt			int					not null,
writeTM			timestamp		not null,
filename		char(100)			null,
constraint pk_BBS_TBL primary key	(no)
);
desc bbs_TBL;

insert into bbs_TBL(writerID, articleTitle, readCnt, writeTM)
values('tree','연습글제목입니다.',0,now());


insert into bbs_TBL(writerID, articleTitle, readCnt, writeTM) 
values('hana02','안녕하세요!',0,now()),
('tree','자기 소개입니다.',0,now()),
('camping','카페 매니저님 질문있습니다!',0,now());

select concat(count(*),'개') as'전체개수' from bbs_TBL;

