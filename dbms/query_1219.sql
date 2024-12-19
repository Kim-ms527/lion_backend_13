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
select * from a;

drop table b;  -- 테이블 삭제

select * from a
union
select * from b;

select * from a
union all
select * from b;


select A.name from A, B where A.name = B.name;
select A.name from A where A.name not in (select B.name from B);

SELECT sal, ename,
rank() over(order by sal desc) AS ranking
FROM emp;

SELECT sal, ename,
rank() over(order by comm desc) AS ranking
FROM emp;

create table test(
id int,
name varchar(100)
);
select * from test;
insert into test values (1,'carami');

create table exam(
id int primary key,
name varchar(100)
);

select * from exam;
insert into exam values(1,'carami');
insert into exam values(2,'carami');

create table auto_exam(
id int primary key auto_increment,
name varchar(100)
);

-- insert  테이블에 데이터 입력 하는 명령어.  insert into 테이블명 [(컬럼들..)] values (값들..) 
insert into auto_exam values('carami'); -- 오류!! 컬럼들이 생략될때는  values(모든 컬럼에 값들이 나열..) 
insert into auto_exam (name) values ('carami'); 
-- 테이블 뒤에 컬럼이 나열되면 values 뒤에 앞에 나열된 컬럼에 맞는 값을 넣어줘야함. 

select * from auto_exam;
insert into auto_exam (name) values ('kim222'); 

insert into auto_exam values(40,'carami222');






-- Book   (id - int , title - varchar(150), author -- varchar(100), published_date date 
-- price int ) 
create table book(
	id int auto_increment primary key,
    title varchar(150) not null, 
    author varchar(100) not null,
    published_date date,
    price int 
);

insert into book (id,author,title) values  (1,'kang','java');
select * from book;

 desc emp;
 -- emp 테이블에 데이터 한 건 입력해 보세요. 
  insert into emp values (null, "asd", "no job", null, null, 0, null, null); 

insert into emp (ename, job, mgr, hiredate, sal, comm, deptno) 
values ('dgkim','developer','10',date(now()),1000,20,10);



  insert into emp values (null, "asd", "no job", null, null, 0, null, 50); 
  select * from dept;
  
  
  -- user_accounts  ( id, username, email, password, created_at, role_id) 
  
  -- roles ( id, name) 
  
  create table roles(
	id int auto_increment primary key,
    name varchar(50) not null unique
  );
  
  create table user_accounts(
	id int auto_increment primary key,
    user_id varchar(50) not null unique,
    user_name varchar(45) not null,
    email varchar(100) not null unique,
    password varchar(200) not null,
    create_at datetime default current_timestamp,
    role_id int,
    foreign key fk_user_roles (role_id) references roles(id) on delete set null
  );
  
  -- 제약조건의 이름을 명시적으로 정해 줄 수도 있고,  정하지 않으면 DBMS가 알아서 정해줘요.  
  
  insert into roles(name) values('admin'),('user'),('guest');
  select * from roles;
  
  -- user_account 테이블에 데이터 5건 입력해주세요. 
  insert into user_accounts(user_id, user_name, email, password, role_id) 
  values
  ('abcd1234','Alex','alex1@gmail.com','qwe123',2),
  ('sad2352','Keith','keith34@gmail.com','qwe123',1);
 insert into user_accounts(user_id, user_name,email,password,create_at,role_id) 
 values
('shm7305', 'SHM', 'SHM2345@naver.com', 'cde2345', default, 2);
 
 select * from user_accounts;
 
 
 SET time_zone = 'America/Denver';  -- 내 세션의 타임존만 바뀌어요!! 
 
 set time_zone = 'Asia/Seoul';
 SELECT @@global.time_zone, @@session.time_zone;
 
 SELECT NOW();
 SET GLOBAL time_zone = 'Asia/Seoul';
 
 
 desc user_accounts;

select * from roles;

set autocommit = 0;   --  0 (자동커밋 끄기)  1 자종커밋 켜기
-- 트랜잭션 시작!! 
 insert into roles(name) values('test2');
 -- commit (적용해주세요.)  insert, update, delete, ..  트랜잭션 제어어 (데이터가 직접적으로 바뀌는 것들..) 
  insert into roles(name) values('test3');
   insert into roles(name) values('test4');
    insert into roles(name) values('test5');
    
    commit;
    
        insert into roles(name) values('test6');
            insert into roles(name) values('test7');
	rollback;  -- 실행취소  
    -- create ...    이런 명령들이 실행되면 앞에서 썼던 것들이 커밋된다. 
    
    -- 트랜잭션 (나눌 수 없는 하나의 업무 단위..)  
    -- 계좌이체.  A - B 계좌로 50000 원 이체한다라고 하면.  
    -- A 계좌에서 50000 출금,  B 계좌에 50000  입금.  
    
-- 수정 update 테이블명 set 업데이터할컬럼명 = '업데이트할 값' , 업데이터할 컬럼명 = '업데이터할 값'   //where 절을 빼면 모든 데이터 수정!! 
-- where 조건 
 update roles 
 set name = 'ttttt';
 
 show tables;
 desc a;
 update a set name = 10;  -- where 가 없으면 모든 데이터가 수정됨.  주의!!
 select * from a;
 rollback;
 
  update roles 
 set name = 'ttttt'
 where id = 5;
 select * from roles;

-- 삭제 
delete from roles  where id = 1;
select * from user_accounts;
-- alter  // 수정해줘요.  
alter table user_accounts 
drop foreign key fk_user_roles; 

alter table user_accounts
add constraint fk_user_roles
foreign key (role_id) references roles(id)
-- on delete cascade    삭제시 같이 삭제 
on delete set null;

delete from user_accounts ;   -- where 절을 이용하지 않으면 모든 데이터 삭제 주의!!!  

delete from user_accounts where id = 1;
delete from user_accounts where role_id = 2;
rollback;