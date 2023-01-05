package com.websiteBService.repository.mapper;


import com.websiteBService.model.OrderStatus;
import com.websiteBService.model.UserOrder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserOrderMapper implements RowMapper<UserOrder> {

    @Override
    public UserOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new UserOrder(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getDate("order_date"),
                rs.getLong("total_price"),
                rs.getString("shipping_address"),
                OrderStatus.valueOf(rs.getString("order_status"))
        );
    }
}