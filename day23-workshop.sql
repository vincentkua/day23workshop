select * from orders;
select * from order_details;
select * from products;

select id as order_id , order_date , customer_id from orders where id = 30;
select * from order_details where order_id =30;

select o.id , o.order_date , d.product_id , d.quantity , d.unit_price , d.discount , (d.quantity * d.unit_price * if(d.discount > 1, d.discount , 1) ) as total_price , p.standard_cost, (d.quantity * p.standard_cost) as total_cost
from orders as o
left join order_details as d
on o.id = d.order_id
left join products as p
on d.product_id = p.id
where o.id = 30;

select sum(d.quantity * p.standard_cost) as total_cost
from orders as o
left join order_details as d
on o.id = d.order_id
left join products as p
on d.product_id = p.id
where o.id = 30;

select o.id as order_id, o.order_date, o.customer_id , sum(d.quantity * p.standard_cost) as total_cost, sum(d.quantity * d.unit_price * if(d.discount > 1, d.discount , 1) ) as total_price 
from orders as o
left join order_details as d
on o.id = d.order_id
left join products as p
on d.product_id = p.id
where o.id = 30;
