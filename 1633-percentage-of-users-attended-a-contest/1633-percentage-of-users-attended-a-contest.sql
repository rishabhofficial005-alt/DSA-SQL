# Write your MySQL query statement below
select r1.contest_id,ROUND(COUNT(r1.user_id) * 100.0 / (SELECT COUNT(*) FROM Users), 2)
as 'percentage' from 
Register r1  join 
Users u1 on r1.user_id=u1.user_id
group by r1.contest_id
order by percentage desc, r1.contest_id;
