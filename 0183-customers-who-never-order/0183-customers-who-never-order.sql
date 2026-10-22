# Write your MySQL query statement below
-- select name as Customers from Customers as c
-- left join Orders o
-- on c.id=o.customerId
-- where o.customerId is null;

select name as customers from customers c
where  not exists (select customerId from orders o where o.customerId=c.id)