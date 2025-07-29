# Write your MySQL query statement below
with grouped as(
    select customer_Id,name,visited_on,sum(amount) amount from Customer group by visited_on 
)


select visited_on ,
sum(amount) over (order by visited_on ROWS between 6 preceding and current row ) amount,
round(avg(amount) over (order by visited_on ROWS between 6 preceding and current row),2) average_amount
from grouped   group by name,visited_on order by visited_on 
limit 6, 100000