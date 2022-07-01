--------------
https://www.codewars.com/kata/58113a64e10b53ec36000293/train/sql
--------------

For this challenge you need to create a SELECT statement that will contain data about departments that had a sale with a price over 98.00 dollars. This SELECT statement will have to use an EXISTS to achieve the task.

SELECT d.id, d.name
FROM departments d
WHERE EXISTS (
  SELECT s.id 
  FROM sales s 
  WHERE s.department_id = d.id
  AND s.price > 98
);


-----
SQL Basics - Trimming the Field
codewars.com/kata/59401c25c15cbeb58d000028/train/sql
-----
select id, name, SPLIT_PART(characteristics, ',', 1) as characteristic
from monsters
order by id;


------------

------------