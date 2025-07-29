# Write your MySQL query statement below
select id, 
case 
WHEN id % 2 = 1 THEN LEAD(student, 1, student) OVER (ORDER BY id)
when id % 2 = 0 then lag(student,1) over (order by id)
end as student
from Seat order by id asc