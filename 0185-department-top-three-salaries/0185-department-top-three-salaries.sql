# Write your MySQL query statement below
with ranking as 
(
    select d.name Department, e.name Employee, e.salary Salary,
dense_rank() over (partition by d.name order by e.salary desc )as ranks
from Employee e join Department d on d.id = e.departmentId group by d.name,e.name order by d.name,e.salary desc
) 
select Department, Employee, Salary from ranking where ranks <= 3 
