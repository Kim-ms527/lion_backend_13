select version();
select curdate();
select current_user();
select sin(pi()/4);
select 4+1;

select 
version(),
4+1;
-- 주석   
-- 사용자 생성   
-- 아이디 통일시켜서 만들어 볼까요?  like/lion     hr  -  database   
create user 'like'@'%' identified by 'lion';
create user 'like'@'localhost' identified by 'lion';
-- 사용자가 생성이 되었다고 해서, 어떤 일을 할 수 있는 것은 아니다. 
-- 사용자는 반드시 권한을 부여 받아야 한다. 
grant All privileges on exampledb.* to 'like'@'%';
grant All privileges on exampledb.* to 'like'@'localhost';

-- hr  DB생성   
create database hr; 

grant All privileges on hr.* to 'like'@'%';
grant All privileges on hr.* to 'like'@'localhost';

flush privileges;
-- 실습   
-- 1. back/end   --  user - back   password - end      user를 생성해 보세요. 
create user 'back'@'%' identified by 'end';
create user 'back'@'localhost' identified by 'end';
-- 2. database -  scott   라는 이름의 데이터 베이스를 생성해 보세요. 
create database scott;
-- 3. back 유저에게 scott 디비를 사용 할 수 있는 권한을 부여해주세요.  
grant All privileges on scott.* to 'back'@'%';
grant All privileges on scott.* to 'back'@'localhost';
flush privileges;
-- 4.  홈 화면으로 가서 back 유저가 scott 계정을 기본 스키마로 사용할 수 있도록 만들어주세요. 



 
