package com.websiteBService.repository;

import com.websiteBService.model.UserOrder;
import com.websiteBService.repository.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserOrderRepositoryImpl implements UserOrderRepository{
    private static final String USER_ORDER_TABLE_NAME = "user_order";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createOrder(UserOrder userOrder) {
        String sql = "INSERT INTO " + USER_ORDER_TABLE_NAME + " (user_id ,order_date ,total_price ,shipping_address ,order_status) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql,userOrder.getUserId(),userOrder.getOrderDate(),userOrder.getTotalPrice(),userOrder.getShippingAddress(),userOrder.getOrderStatus().name());
    }


    @Override
    public void updateUserOrderById(Long userOrderId, UserOrder userOrder) throws Exception {
        String sql = "UPDATE " + USER_ORDER_TABLE_NAME + " SET user_id=? ,order_date=? ,total_price=? ,shipping_address=? ,order_status=?" +
                "WHERE id=?";
        jdbcTemplate.update(sql, userOrder.getUserId(), userOrder.getOrderDate(),userOrder.getTotalPrice(),userOrder.getShippingAddress(),userOrder.getOrderStatus().name(), userOrderId);
    }

    @Override
    public void deleteUserOrderById(Long id) throws Exception {
        String sql = "DELETE FROM " + USER_ORDER_TABLE_NAME + " WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public UserOrder getUserOrderById(Long id) {
        String sql = "SELECT * FROM " + USER_ORDER_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new UserOrderMapper(), id);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }

    @Override
    public List<UserOrder> getUserOrdersByUserId(Long userId) {
        String sql = "SELECT * FROM " + USER_ORDER_TABLE_NAME + " WHERE user_id=?";
        try {
            return jdbcTemplate.query(sql, new UserOrderMapper(), userId);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }

}
