package com.websiteBService.model;
import java.util.Date;


public class UserOrder {
    private Long id;
    private Long userId;
    private Date orderDate;
    private Long totalPrice;
    private String shippingAddress;
    private OrderStatus orderStatus;

    public UserOrder(Long id, Long userId, Date orderDate, Long totalPrice, String shippingAddress, OrderStatus orderStatus) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}