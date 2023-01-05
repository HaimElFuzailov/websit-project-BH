package com.websiteBService.repository;

import com.websiteBService.model.FavoriteList;
import com.websiteBService.model.OrderList;
import com.websiteBService.repository.mapper.FavoriteMapper;
import com.websiteBService.repository.mapper.OrderListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderListRepositoryImpl implements OrderListRepository{

    private static final String ORDER_LIST_TABLE_NAME = "order_list";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createOrderList(OrderList orderList) {
        String sql = "INSERT INTO " + ORDER_LIST_TABLE_NAME + " (order_list_id ,item_id ) VALUES (?,?)";
        jdbcTemplate.update(sql,orderList.getOrderListId(),orderList.getItemId());
    }

    @Override
    public void updateOrderListById(Long id, OrderList orderList) throws Exception {
        String sql = "UPDATE " + ORDER_LIST_TABLE_NAME + " SET order_list_id=? ,item_id=?" + "WHERE id=?";
        jdbcTemplate.update(sql,orderList.getOrderListId(),orderList.getItemId());
    }

    @Override
    public void deleteOrderListById(Long id) throws Exception {
        String sql = "DELETE FROM " + ORDER_LIST_TABLE_NAME + " WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public OrderList getOrderListById(Long id) {
        String sql = "SELECT * FROM " + ORDER_LIST_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new OrderListMapper(), id);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }
}
