connect manager01;
--���̺� ����
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
(staffSeq.nextval, 'hy_Ahn', '������', 5, '����');


insert into staff
(num, userid, username, yearRank, position)
values
(staffSeq.nextval, 'jk_Heo', '������', 3, '�븮');

SELECT * FROM staff;
select*from staff order by num desc;

update staff set position = '����' where userid =  'hy_Ahn';

set autocommit on;
set autocommit off;
show autocommit;



commit;

-- sqlplus ������ insert, updatem delete ����� ������ ��
-- DB �����ݿ��ȴ�.(autocommit �Ӽ��� �⺻  true; ���� . ��, autocommit omn);
-- sqlDeeloper ������ insert, updatem delet ����������� ��
--