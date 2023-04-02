package nus.iss.day23workshop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import nus.iss.day23workshop.model.Order;



@Repository
public class OrderRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    private static final String FINDORDERSQL = """
        select o.id as order_id, o.order_date, o.customer_id , sum(d.quantity * p.standard_cost) as total_cost, sum(d.quantity * d.unit_price * if(d.discount > 1, d.discount , 1) ) as total_price 
        from orders as o
        left join order_details as d
        on o.id = d.order_id
        left join products as p
        on d.product_id = p.id
        where o.id = ?;
        """;

    public Order findOrderDetails(Integer order_id){
        Order order = new Order();
        order = jdbcTemplate.queryForObject(FINDORDERSQL, BeanPropertyRowMapper.newInstance(Order.class) , order_id);
        return order;
    }

    
}
