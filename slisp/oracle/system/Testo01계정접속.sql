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




--������ ����(=��ȣ �÷� �ڵ�����)
create sequence goodsList_seq
start with 1
increment by 1;

-- ���� ����
-- update T/N set ������ C/N = ������ �� where code =' ';

-- ������ ��� ��ü�������� ������ �ƴ϶��
--where �������� �ݵ�� ����Ѵ�. 


--���� ����
--delete from T/N ; ��ü ������ ����
--delete from T/N where ���C/N= ������;


drop sequence goodsList_seq;
drop table goodsList; --���̺� ����
commit;

insert into goodsList(name, code,num, price)
values ('Ű����' ,'keyboard', 7,34000 );

insert into goodsList(num, code, name, price, opt, makedate)
values(goodsList_seq.nextval, 'mouse', '���콺', 13000, '��Ƽ��','20231009');
insert into goodsList     
values(goodsList_seq.nextval, 'stick', '�����', 14000, '����','20240813');

select *from goodsList where name='�޴���';    -- ���� ��ȸ, ���� �˻�
select *from goodsList where code like '%a%';          --�κй��ڿ� ���ǰ˻�
                                                        --��ǥ����, Wild card(���ϵ� ī��)
                                                        
select count(*)from goodsList where code like '%a%';          --��ȸ�� �ڷ��� ��ü ���� Ȯ��
select * from goodsList where price<30000;         ---������ (price)3���� �̸��� ��ǰ����            
select * from goodsList where price<30000 order by price desc;         --- ������ ������ ����=> where ���� ���� �� order by ����
                                              -- ������ (price)�� 3���� �̸��λ�ǰ�� �������� �˻�
select * from goodslist goodsList where price>=30000 and price<50000;    --4������ ��ǰ �˻�(30000�� �̻� 50000�� �̸�)

--���ӱ��� : && 2���� �̻� 3���� ����
-- => and ���� �׸��� ����
--�л걸�� : || 2���� �̸� 3���� �̻�
--=> or����, �Ǵ� ����

select *from goodsList order by num; --asc, ��������, �⺻���� �Ӽ���
select *from goodsList;
select *from goodsList order by num desc; --desc, ��������
select * from goodslist goodsList where price>=30000 and price<50000;    --4������ ��ǰ �˻�(30000�� �̻� 50000�� �̸�)

--���ӱ��� : && 2���� �̻� 3���� ����
-- => and ���� �׸��� ����
--�л걸�� : || 2���� �̸� 3���� �̻�
--=> or����, �Ǵ� ����

select *from goodsList order by num; --asc, ��������, �⺻���� �Ӽ���

select *from goodsList where price between 30000 and 49999;
select price, name �̸�, num ��ȣ from goodsList;
desc goodsList;

select num, code, name, price, opt, makedate from goodsList order by num desc;

select*from user_tables;


--������ = �ڵ����� �Ӽ�