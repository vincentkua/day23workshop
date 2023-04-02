package nus.iss.day23workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nus.iss.day23workshop.model.Order;
import nus.iss.day23workshop.repository.OrderRepository;

@Controller
@RequestMapping(path = "")
public class OrderController {

    @Autowired
    OrderRepository orderRepo;

    @GetMapping(value = {"/" , "/index"})
    public String showEmptyForm(Model model){
        Order order = new Order();
        model.addAttribute("order", order);

        return "order";
    }
    
    @GetMapping(value = "/order/total")
    public String findOrderDetails(@RequestParam("order_id") Integer order_id, Model model){
        Order order = new Order();
        order = orderRepo.findOrderDetails(order_id);
        if(order.getOrderId() == null){
            return "notfound";
        }else{
            model.addAttribute("order", order);
            return "order";
        }

    }
}
