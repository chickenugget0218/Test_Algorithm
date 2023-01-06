-- 코드를 입력하세요
SELECT a.ingredient_type, sum(b.TOTAL_ORDER) as total_order
from icecream_info as a
left join first_half as b
on a.FLAVOR = b.FLAVOR
group by ingredient_type
order by total_order ;
