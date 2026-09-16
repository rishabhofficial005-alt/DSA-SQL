# Write your MySQL query statement below
select r1.contest_id ,ROUND(count(u1.user_id)/(select count(*) from Users)*100,2) as 'percentage'
from Register r1
join Users u1
on r1.user_id=u1.user_id
group by r1.contest_id
order by percentage desc,contest_id;
