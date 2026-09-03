# Write your MySQL query statement below
select q1.query_name,
round((sum(q1.rating/q2.position))/count(q1.query_name),2) as 'quality',
round((sum(q1.rating<3)/count(q1.query_name)*100),2) as 'poor_query_percentage'
from Queries q1 
join Queries q2
on q1.query_name=q2.query_name
and q1.result=q2.result
group by q1.query_name;
