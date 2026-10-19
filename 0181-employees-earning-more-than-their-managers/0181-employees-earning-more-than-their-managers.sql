# Write your MySQL query statement below
-- select emp.name as Employee from Employee emp
-- join Employee mgr
-- on emp.managerId=mgr.id
-- where emp.salary>mgr.salary;

select emp.name as Employee from Employee emp
where emp.salary > (select mgr.salary  from Employee mgr
where emp.managerId=mgr.id)