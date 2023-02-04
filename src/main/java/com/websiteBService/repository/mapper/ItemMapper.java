package com.websiteBService.repository.mapper;

import com.websiteBService.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper implements RowMapper<Item> {

    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Item(
                rs.getLong("item_id"),
                rs.getString("title_of_the_item"),
                rs.getString("photo_of_the_item"),
                rs.getLong("price"),
                rs.getLong("how_much_items_available_in_stock")
        );
    }
}
