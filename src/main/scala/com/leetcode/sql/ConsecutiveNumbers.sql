--180. Consecutive Numbers
--SQL Schema
--Table: Logs
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| id          | int     |
--| num         | varchar |
--+-------------+---------+
--id is the primary key for this table.

-- Write an SQL query to find all numbers that appear at least three times consecutively.
--
--   Return the result table in any order.
--
--   The query result format is in the following example:
--
--
--
--   Logs table:
--   +----+-----+
--   | Id | Num |
--   +----+-----+
--   | 1  | 1   |
--   | 2  | 1   |
--   | 3  | 1   |
--   | 4  | 2   |
--   | 5  | 1   |
--   | 6  | 2   |
--   | 7  | 2   |
--   +----+-----+
--
--   Result table:
--   +-----------------+
--   | ConsecutiveNums |
--   +-----------------+
--   | 1               |
--   +-----------------+
--   1 is the only number that appears consecutively for at least three times.


with cte AS
(
SELECT id, num
,lead(num,1) over (order by id) AS Num1
,lead(num,2) over (order by id) as Num2
from logs
)

SELECT distinct num as ConsecutiveNums
from cte
WHERE num=num1 AND num=num2;