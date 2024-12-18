use hr;
select e.employee_id, e.first_name, e.email ,c.country_name, r.region_name
from employees e,departments d, locations l,countries c, regions r
where  e.department_id = d.department_id 
and d.location_id = l.location_id
and l.country_id = c.country_id
and c.region_id = r.region_id;


select count(*) from employees;
select count(department_id) from employees;

-- 사원의 이름과 부서명을 출력하시오. 단 location_id 가 1800인 경우만 출력하시오.
select e.first_name , d.department_name from employees e, departments d
where e.department_id = d.department_id
and d.location_id = 1800;