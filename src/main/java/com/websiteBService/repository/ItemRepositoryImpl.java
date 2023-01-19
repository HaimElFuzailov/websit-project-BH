package com.websiteBService.repository;

import com.websiteBService.model.Item;
import com.websiteBService.model.UserOrder;
import com.websiteBService.repository.mapper.ItemMapper;
import com.websiteBService.repository.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class ItemRepositoryImpl implements ItemRepository{

    private static final String ITEM_TABLE_NAME = "item";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void createItem(Item item) {
        String sql = "INSERT INTO " + ITEM_TABLE_NAME + " (item_id ,title_of_the_item ,photo_of_the_item ,price_in_usd ,how_much_items_available_in_stock) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql,item.getId(),item.getTitleOfTheItem(),item.getPhotoOfTheItem(),item.getPriceInUsd(),item.getHowMuchItemsAvailableInStock());
    }

    @Override
    public void updateItemById(Long id, Item item) throws Exception {
        String sql = "UPDATE " + ITEM_TABLE_NAME + " SET item_id=? ,title_of_the_item=? ,photo_of_the_item=? ,price_in_usd=? ,how_much_items_available_in_stock=?" +
                "WHERE id=?";
        jdbcTemplate.update(sql,item.getId(),item.getTitleOfTheItem(),item.getPhotoOfTheItem(),item.getPriceInUsd(),item.getHowMuchItemsAvailableInStock());
    }

    @Override
    public void deleteItemById(Long id) throws Exception {
        String sql = "DELETE FROM " + ITEM_TABLE_NAME + " WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Item getItemById(Long id) {
        String sql = "SELECT * FROM " + ITEM_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new ItemMapper(), id);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }



    @Override
    public List<Item> getAllItems(Long id) {
        String sql = "SELECT * FROM " + ITEM_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.query(sql, new ItemMapper(), id);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }
}
