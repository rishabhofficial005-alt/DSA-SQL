# Write your MySQL query statement below
select s1.user_id, ifnull(round(sum(action = 'confirmed')/count(*),2),0.00)
as 'confirmation_rate'
from Signups s1 left join
Confirmations c1 
on s1.user_id=c1.user_id
group by s1.user_id;