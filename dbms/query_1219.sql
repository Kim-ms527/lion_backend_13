create table a(
	name int
);
create table b(
	name int 
);

select database();

show tables;

insert into a values(1);
insert into a values(3);

insert into b values(4);

select * from a
union
select * from b;
desc a;
delete from b where name = 4; -- 해당 데이터 삭제 
select * from b;

drop table b;  -- 테이블 삭제

select * from a
union
select * from b;

select * from a
union all
select * from b;


select A.name from A, B where A.name = B.name;
select A.name from A where A.name not in (select B.name from B);




