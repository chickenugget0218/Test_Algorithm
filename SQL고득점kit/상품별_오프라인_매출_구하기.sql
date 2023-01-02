-- 코드를 입력하세요
SELECT a.product_code, sum(a.price*b.sales_amount) as sales
from product as a
left join offline_sale as b
on a.product_id = b.product_id
group by product_code
order by sales desc, product_code asc;