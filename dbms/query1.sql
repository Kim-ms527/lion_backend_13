use hr; -- 현재 사용자가 hr에 대한 권한을 가지고 있었을 때 가능!! 
use scott;

desc emp;  -- 테이블 구조를 보여줌. 

select empno, deptno, ename from emp;
select * from emp;

show tables; 

-- 조회 
select empno,ename,job from emp;  -- select 조회할 컬럼들,, from 조회할 테이블 들 
desc dept; 
select deptno,dname,loc from dept;
desc salgrade;
select grade, min_salary,max_salary from salgrade;
use hr;
show tables;
desc countries;

use scott;
desc emp;
select distinct deptno from emp;
select distinct empno, deptno from emp;
select empno 사번, sal as 급여  from emp;
select empno, sal * 18 연봉 from emp;
select empno, sal depno from emp;
select empno 사번, sal as "급 여"  from emp;

select concat(ename,'사원의 급여는 ',sal) as 사원 from emp;

use hr;

  SELECT concat( first_name, ' ', last_name) AS 이름,
         hire_date AS 입사일
    FROM employees;

use scott;
select * from emp order by ename desc;
select deptno, ename, sal, comm from emp order by sal desc,ename ;
select deptno, ename, sal, comm from emp order by 3 desc,2 ;
select deptno, ename, sal, comm from emp order by deptno desc, sal desc, ename ;
select deptno, ename,sal, empno from emp;
-- where  조건에 맞는 데이터만 조회 
select * from emp where sal > 2500;
select * from emp where deptno = 20;
-- 조건 연결.  and, or
select * from emp 
where deptno = 20 and sal > 2500;

select * from emp 
where deptno = 20 or sal > 2500;

select * from emp;
-- null 은 = 로 비교안됨.   is null,  is not null  이용. 
select * from emp where comm is null;
select * from emp where comm is not null;

-- like    -- 값에 대해서 ename -> SMITH, ALLEN 값.  일반적인 DBMS들은 값에대해서 대소문자 구분한다.
select * from emp where lower(ename)='smith';
select * from emp where ename='SMITH';
select * from emp where upper(ename) = 'SMITH';

select lower(ename) from emp;
-- _ , %   _ 한글자를 대체,  % 0~여러개 대체가능
select * from emp where ename like '____';
select * from emp where ename like '%s';
select * from emp where ename like '%s';

select * from emp where deptno = 10 or deptno = 20;
select * from emp where deptno in (10, 20);
select * from emp where job in ('MANAGER','clerk','analyst');
select * from emp where job not in ('MANAGER','clerk','analyst');
select * from emp where deptno not in (10, 20);


select upper('Test') , lower('Test');

select upper(ename), lower(ename) from emp;
select ucase(ename) from emp;
-- DBMS들은 인덱스를 대체로 1번부터 사용한다. 
select substring('Happy Day',3,2);  -- 3번 인덱스에서부터 2자 잘라주세요.

select substring('Happy Day',5,3); 
desc emp;
select date_add(hiredate,INTERVAL 1 DAY) from emp;
select * from emp;

SELECT REVERSE('abc');  -- from 테이블절이 없이 수행.    orcle--  from dual;

select reverse(ename) from emp;

use hr;
show tables;
desc employees;




select * from employees;

select * from employees where first_name = 'Karen';

select * from employees where employee_id = 114;
desc employees;
-- index 조회
show index from employees;
-- index 생성
create index ind_employees_first_name on employees(first_name);
-- index 삭제
drop index ind_employees_first_name on employees;

use scott;

