##### D/N:sampleData######
use sampledata;

drop table memeber;
create table member(
uid char(20)	,
uname char(20)
);

desc memeber;

insert into member values
('tester01','테스터01'),
('guest02','게스트02'),
('lemon','레몬');

select*from member;