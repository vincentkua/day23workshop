package nus.iss.day23workshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.day23workshop.model.Order;
import nus.iss.day23workshop.repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    OrderRepository orderRepository;

    public Order findOrderDetails(Integer order_id){
        return orderRepository.findOrderDetails(order_id);
    }
}
