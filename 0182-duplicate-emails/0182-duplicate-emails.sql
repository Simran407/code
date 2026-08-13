# Write your MySQL query statement below
select email from Person
GROUP BY Email
having count(email)>1;
