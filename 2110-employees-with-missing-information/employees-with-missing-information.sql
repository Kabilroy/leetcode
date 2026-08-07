# Write your MySQL query statement below
select k.employee_id from Employees as k left join Salaries as l on k.employee_id = l.employee_id where  l.salary is null
union 
select l.employee_id from Salaries as l 
left join Employees as k on l.employee_id = k.employee_id
 where name is null
 order by employee_id;
