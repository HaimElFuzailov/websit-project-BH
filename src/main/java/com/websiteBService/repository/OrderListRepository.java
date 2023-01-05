package com.websiteBService.repository;

import com.websiteBService.model.FavoriteList;
import com.websiteBService.model.OrderList;

public interface OrderListRepository {
    void createOrderList(OrderList orderList);


    void updateOrderListById(Long id, OrderList orderList) throws Exception;

    void deleteOrderListById(Long id) throws Exception;

    OrderList getOrderListById(Long id);
}
