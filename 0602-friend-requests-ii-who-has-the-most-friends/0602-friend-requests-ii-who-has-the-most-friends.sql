# Write your MySQL query statement below
with ids as (
    select  r.requester_id id from RequestAccepted r   

    union all

    select  r.accepter_id id from RequestAccepted r  
)

select id, count(id) num from ids group by id order by count(id) desc limit 1