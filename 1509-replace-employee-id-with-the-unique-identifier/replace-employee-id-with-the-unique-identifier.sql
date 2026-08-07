# Write your MySQL query statement below
select ep.unique_id ,e.name from Employees e left join EmployeeUNI ep 
on e.id = ep.id;