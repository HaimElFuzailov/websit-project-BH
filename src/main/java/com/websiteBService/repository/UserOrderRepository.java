package com.websiteBService.repository;

import com.websiteBService.model.UserOrder;

import java.util.List;


public interface UserOrderRepository {

    void createOrder(UserOrder userOrder);


    void updateUserOrderById(Long userOrderId, UserOrder userOrder) throws Exception;

    void deleteUserOrderById(Long id) throws Exception;

    UserOrder getUserOrderById(Long id);

    List<UserOrder> getUserOrdersByUserId(Long userId);

}
