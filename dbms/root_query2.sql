show databases;

drop database scott;
drop database hr;

create database hr;
create database scott;

drop user 'like'@'%';
drop user 'like'@'localhost';

create user 'like'@'%' identified by 'lion';
create user 'like'@'localhost' identified by 'lion';

grant ALL privileges on scott.* to 'like'@'%';
grant ALL privileges on scott.* to 'like'@'localhost';

flush privileges;

 SET GLOBAL time_zone = 'Asia/Seoul';
 
  SELECT @@global.time_zone, @@session.time_zone;
  
create database likebank;

grant ALL privileges on likebank.* to 'like'@'%';
grant ALL privileges on likebank.* to 'like'@'localhost';

flush privileges;