# Write your MySQL query statement below
with sorted as (
    select *,sum(weight) over (order by turn ) total from Queue order by turn
)
select person_name  from sorted where total <=1000 order by turn desc limit 1
 