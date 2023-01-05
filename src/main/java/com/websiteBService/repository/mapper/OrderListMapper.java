package com.websiteBService.repository.mapper;

import com.websiteBService.model.FavoriteList;
import com.websiteBService.model.OrderList;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderListMapper implements RowMapper<OrderList> {
    @Override
    public OrderList mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new OrderList(
                rs.getLong("order_list_id"),
                rs.getLong("item_id")
        );
    }
}
