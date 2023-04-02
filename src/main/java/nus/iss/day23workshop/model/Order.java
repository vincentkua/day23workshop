package nus.iss.day23workshop.model;

import java.sql.Date;

public class Order {
    private Integer orderId;
    private Date orderDate;
    private Integer customerId;
    private Float totalCost;
    private Float totalPrice;
    public Order() {
    }
    public Order(Integer orderId, Date orderDate, Integer customerId, Float totalCost, Float totalPrice) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.totalCost = totalCost;
        this.totalPrice = totalPrice;
    }
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Float getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }
    public Float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customerId=" + customerId + ", totalCost="
                + totalCost + ", totalPrice=" + totalPrice + "]";
    }
  
    
    
}
