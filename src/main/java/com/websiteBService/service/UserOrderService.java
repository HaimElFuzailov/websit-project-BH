package com.websiteBService.service;

import com.websiteBService.model.UserOrder;

import java.util.List;


public interface UserOrderService {
    void updateUserOrderById(Long userOrderId, UserOrder userOrder) throws Exception;

    void deleteUserOrderById(Long userOrderId) throws Exception;

    UserOrder getUserOrderById(Long userOrderId);

    void createOrder(UserOrder userOrder)throws Exception;

    List<UserOrder> getAllOrders(Long id);
}
