use scott;
select lpad('hi',5,'?');
select lpad(ename, 10, '*')from emp;

select empno, Lpad(cast(sal as char),10,'*') from emp;

SELECT TRIM(' h    i '),TRIM(BOTH 'x' FROM 'xxxhxxixxx');

select empno, round(sal) from emp;

-- 형변환 cast(값 as 데이터타입) 
-- 형변환시 주의 필요!!  
select cast(1-2 as unsigned);   -- unsigned 부모없는 정수 표현..  - 값은 표현 할 수 없으므로 오버플로우 발생. 
select 1-2;
select cast(-1 as unsigned), cast(-1 as signed);

select cast('1234' as signed) + 50;
select '1234' + 50;   --  원래는 안되야 하는데 mysql이 그냥 변환해서 해줌.  

-- convert(값, 타입) 
select convert(123,char);


-- 단일행 함수 ( 위에서 본것들 모두) 
select lpad(ename, 10, '#') from emp;

-- 그룹함수   여러행에 결과가 하나. 
select sum(sal) from emp;
select avg(sal) from emp;

-- 그룹별로...  
-- 각 부서의 급여의 총 합을 알고 싶어요.
select sum(sal) from emp where deptno = 10;
select sum(sal) from emp group by deptno;
-- 그룹함수를 사용할 때 참여할 수 있는 컬럼??  그룹핑에 참여한 컬럼만 select 절에 올 수 있다. 
select deptno, sum(sal) from emp group by deptno;
select ename,  deptno, sum(sal) from emp group by deptno;-- 오류를 일으킴..  ename은 그룹핑에 참여하지 않았으므로!!  

select job, sum(sal) from emp group by job;

select job,deptno, sum(sal) from emp group by job,deptno order by 1;

select count(deptno) from emp;
select count(comm) from emp;
select count(*) from emp;
select deptno, count(*) from emp group by deptno;
-- job 별 사원수가 몇 명인지 알고 싶어요.
select job, count(*) from emp group by job;
-- job별 사원수와, 평균급여 를 알고 있어요. 
select job, count(*), avg(sal), sum(sal) from emp group by job;



