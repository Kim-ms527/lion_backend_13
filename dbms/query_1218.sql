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

-- 20번 부서의 job별 평균급여를 알고 싶어요.    -- 조건 (전체 데이터에대한 조건은 where.. ) 
select job, avg(sal) from emp where deptno = 20 group by job;

-- 부서별 총 급여액이 9000 이 넘는 부서만 보고 싶어요.   -- 조건 (대상.. 그룹핑한 데이터 having) 
select deptno, sum(sal) from emp group by deptno having sum(sal) > 9000;

-- 부서별 평균 금액을 알고 싶어요.  단 부서별 평균 급여가 2500 보다 작은 부서만 보고 싶고, 급여가 4500 이상거나, 1000 미만인 사원은 제외하고 평균급여를 구해주세요.
select deptno, avg(sal) from emp where sal < 4500 group by deptno having avg(sal) < 2500; 
select deptno, avg(sal) from emp where sal < 4500 and sal >= 1000 group by deptno having avg(sal) < 2500; 
select deptno, avg(sal) a from emp where sal < 4500 and sal >= 1000 group by deptno having a < 2500; 

select avg(sal) from emp group by deptno;

--  사원 정보를 알고 싶어요.  사원번호, 이름, 부서명, 급여 정보를 알고 싶어요.  
select empno, ename, dname ,sal from emp, dept;
-- join 조건 
select empno, ename, dname ,sal from emp, dept where emp.deptno = dept.deptno;


-- deptno 를 출력하니 오류가 발생!!  왜? 부서번호가 몇개 있나요? deptno  
select empno, ename,emp.deptno, dname ,sal from emp, dept where emp.deptno = dept.deptno;

-- 각 컬럼의 이름앞에 어떤 테이블의 컬럼인지를 명시적으로 쓰는게 좋다. 
select e.empno, e.ename, e.deptno, d.dname ,e.sal from emp e, dept d 
where e.deptno = d.deptno;


desc emp;
desc dept;
select * from dept;
select * from emp;

select * from emp, dept;

use scott;

select distinct deptno from emp;

select e.ename, e.deptno, d.dname from emp e, dept d 
where e.deptno = d.deptno;
desc emp;
insert into emp values(1111,'kang','teacher',null,null,7000,null,null); 

-- 사원 이름과 부서명을 출력하세요. 단 부서번호가 20 번인 사원만 출력하세요. 
select e.ename,d.dname from emp e ,dept d
where e.deptno = d.deptno
and d.deptno = 20; 

desc salgrade;


select * from salgrade;

-- theta join 
select e.ename, e.sal, s.grade 
from emp e, salgrade s
where e.sal between s.min_salary and s.max_salary;

-- Natural join  이름이 같은 컬럼이 
-- 두 테이블에 존재하면 그 이름을 기준으로 조인조건을 만든다. 

select e.ename,d.dname from emp e ,dept d
where e.deptno = d.deptno;

select e.ename,d.dname 
from emp e natural join dept d;

select e.ename,d.dname 
from emp e join dept d  using(deptno);

select e.ename,d.dname 
from emp e join dept d  on(e.deptno=d.deptno) ;

select e.ename,d.dname 
from emp e left join dept d  on(e.deptno=d.deptno) ;

select e.ename,d.dname 
from emp e right join dept d  on(e.deptno=d.deptno) ;

select e.ename,d.dname 
from emp e left join dept d  on(e.deptno=d.deptno) 
union
select e.ename,d.dname 
from emp e right join dept d  on(e.deptno=d.deptno) ;

-- self join 
-- 사원의 사번과, 이름, 매니저 사번, 매니저 이름을 알고 싶다. 
select e.empno 사번, e.ename 사원이름, 
	m.empno 매니저사번, m.ename 매니저이름
from emp e, emp m
where e.mgr = m.empno;

select e.empno 사번, e.ename 사원이름, 
	m.empno 매니저사번, m.ename 매니저이름
from emp e join emp m on (e.mgr = m.empno);

select e.empno 사번, e.ename 사원이름, 
	m.empno 매니저사번, m.ename 매니저이름
from emp e left join emp m on (e.mgr = m.empno);

-- sub Query  
-- 데이터를 얻어오는데, 질문(쿼리)하나로 답을 얻을 수 없는 경우. 
-- 스미스 사원이 속한 부서의 평균 급여를 알고 싶어요. 

-- 스미스사원의 부서번호
select deptno from emp where ename = 'smith';
select avg(sal) from emp 
where deptno = 20;

-- 쿼리 안에 또 다른 쿼리를 넣어서 사용함.
select avg(sal) from emp 
where deptno = (select deptno from emp where ename = 'smith');

-- 서브쿼리 작성시 주의점. 
-- 쿼리안에 넣어줄 쿼리가 잘 실행되는지 부터 테스트 
select sal from emp where ename = 'scott';
select ename from emp 
where sal > (select sal from emp where ename = 'scott');


SELECT MIN(ename) FROM emp;

select avg(sal) from emp;
select ename, sal from emp where sal < (select avg(sal) from emp); 

SELECT MIN(ename)
FROM emp GROUP BY deptno;
-- multi-row Query
SELECT ename, sal, deptno FROM emp
WHERE ename in (SELECT MIN(ename)
FROM emp GROUP BY deptno);

SELECT ename, sal, deptno FROM emp
WHERE ename in ('kang','CLARK','ADAMS','ALLEN');
SELECT MIN(ename)
FROM emp GROUP BY deptno;

SELECT ename, sal, deptno FROM emp
WHERE ename ='kang' or ename ='CLARK'or ename ='ADAMS'or ename ='ALLEN';

-- in   = or  의 조합이다.  
-- any ,  all  > < = ...   any = or     all == and  
-- in, any, all  연산자가 있다.  

SELECT ename, sal, deptno FROM emp
WHERE ename >all (SELECT MIN(ename)
FROM emp GROUP BY deptno);

select avg(sal)from emp group by deptno;

SELECT * FROM emp WHERE sal >ALL (select avg(sal)from emp group by deptno);

SELECT * FROM emp WHERE sal >ANY(950, 3000, 1250);
-- where sal > 950 or sal > 3000 or sal > 1250 

SELECT * FROM emp WHERE sal >ALL(select avg(sal)from emp group by deptno);
-- where sal > 950 and sal > 3000 and sal > 1250   

-- 사원의 이름, 급여, 부서 번호를 출력하시오. 단 사원의 급여가 그 사원이 속한 부서
-- 의 평균 급여보다 큰 경우만 출력하시오
select * from emp;
select ename, sal, deptno from emp o
where sal > 
(select avg(sal) from emp where deptno = o.deptno);


SELECT deptno, empno, ename, sal
FROM emp
WHERE (deptno,sal) IN (SELECT deptno, max(sal)
FROM emp GROUP BY deptno);

SELECT deptno, max(sal)
FROM emp GROUP BY deptno;

SELECT e.deptno, e.empno, e.ename, e.sal
FROM emp e,
(SELECT s.deptno, max(s.sal) msal
FROM emp s GROUP BY deptno) m
WHERE e.deptno = m.deptno AND e.sal = m.msal;

SELECT s.deptno, max(s.sal) msal
FROM emp s GROUP BY deptno;


SELECT deptno, empno, ename, sal
FROM emp e
WHERE e.sal = (SELECT max(sal)
FROM emp WHERE deptno = e.deptno);