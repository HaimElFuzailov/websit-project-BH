package com.websiteBService.service;


import com.websiteBService.model.OrderList;

public interface OrderListService {
    void createOrderList(OrderList orderList)throws Exception;

    void updateOrderListById(Long id, OrderList orderList) throws Exception;

    void deleteOrderListById(Long id) throws Exception;

    OrderList getOrderListById(Long id);
}
