create table sample(
num     number(2)   ,
userid      char(10)    ,
userpw      char(10)    ,
username    nvarchar2(10),
nowtm       date
);
insert into sample (num, userid, userpw, username, nowtm)
values(1, 'sky', '1234', 'го╢ц', '2024-08-29');

SELECT * from sample;

describe sample

create table goodsList(
num     number(3)       not null    ,
code        varchar(20)     default ''  ,
name        varchar(20)     null        ,
price       number(7)      default 0    ,
opt     nchar(20)                       ,
makedate        date        default sysdate
);

desc goodsList;
select *from all_users;
select table_name from user_tables;
select * from all_tables;