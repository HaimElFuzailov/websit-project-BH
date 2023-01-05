package com.websiteBService.service;

import com.websiteBService.model.User;
import com.websiteBService.model.UserOrder;

import com.websiteBService.repository.UserOrderRepository;
import com.websiteBService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOrderServiceImpl implements UserOrderService{
    @Autowired
    UserOrderRepository userOrderRepository;
    @Autowired
    UserRepository userRepository;

    @Autowired
    WebsiteBSService websiteBSService;

    @Override
    public void createOrder(UserOrder userOrder) throws Exception {
        if(userRepository.getUserById(userOrder.getUserId())!= null) {
            userOrderRepository.createOrder(userOrder);
        }
        else {
            throw new Exception("problem with the service");
        }
    }

    @Override
    public void updateUserOrderById(Long userOrderId, UserOrder userOrder) throws Exception {
       userOrderRepository.updateUserOrderById(userOrderId, userOrder);

    }

    @Override
    public void deleteUserOrderById(Long id) throws Exception {
        userOrderRepository.deleteUserOrderById(id);

    }

    @Override
    public UserOrder getUserOrderById(Long id) {
        return userOrderRepository.getUserOrderById(id);
    }

    @Override
    public List<UserOrder> getAllOrders(Long id) { return userOrderRepository.getUserOrdersByUserId(id); }
}
