			##### p04_BBS ####
            
            create database BBS;
            use BBS;
            
            #userTbl 테이블 구현
create table userTbl(
no 					int 			not null		auto_increment		unique,
userID				char(20)	not null												   ,
userPW				char(20)	not null													,
userNick			char(20)	not null													,
userLevel			char									default 1							,
email					char(30)	not null													,
cellPhone			char(15)																	,
joinTime			timestamp not null			default now()						,
constraint			primary key(userID)
);

select*from userTbl order by no asc;

insert into userTbl (userID, userPW, userNick, userLevel, email,cellPhone, joinTime) values
('goodman', 'a123','머그컵',1,'goodman@naver.com','010-123-4567','2018-06-11'),
('tree', 'b123','노을',1,'tree@daum.net','017-423-4568','2018-07-24'),
('apple', 'c123','커피',2,'apple@naver.com','010-723-4569','2018-11-01'),
('sea', 'd123','캠핑',3,'sea@apple.com','011-323-4560','2019-02-17'),
('brige', 'e123','허브',2,'brige@nat.com','010-2623-4561','2019-04-23');


#articleTbl 테이블 구현(게시판 목록)

create table articleTbl(
no 				int				not null		auto_increment			,
writerID			char(20)		not null	

constraint 		primary key(no)
);

