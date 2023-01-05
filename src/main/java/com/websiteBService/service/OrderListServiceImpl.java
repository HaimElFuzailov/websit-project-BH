package com.websiteBService.service;

import com.websiteBService.model.OrderList;
import com.websiteBService.repository.OrderListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderListServiceImpl implements OrderListService{
    @Autowired
    OrderListRepository orderListRepository;

    @Override
    public void createOrderList(OrderList orderList) throws Exception {
        if(orderListRepository.getOrderListById(orderList.getOrderListId()) != null) {
            orderListRepository.createOrderList(orderList);
        }
        else {
            throw new Exception("problem with the service");
        }
    }

    @Override
    public void updateOrderListById(Long id, OrderList orderList) throws Exception {
        orderListRepository.updateOrderListById(id, orderList);
    }

    @Override
    public void deleteOrderListById(Long id) throws Exception {
        orderListRepository.deleteOrderListById(id);
    }

    @Override
    public OrderList getOrderListById(Long id) {
        return orderListRepository.getOrderListById(id);
    }
}
