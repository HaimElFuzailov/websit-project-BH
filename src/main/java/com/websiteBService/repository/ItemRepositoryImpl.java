package com.websiteBService.repository;

import com.websiteBService.model.Item;
import com.websiteBService.repository.mapper.ItemMapper;
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
        String sql = "INSERT INTO " + ITEM_TABLE_NAME + " (item_id ,title_of_the_item ,photo_of_the_item ,price ,how_much_items_available_in_stock) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql,item.getId(),item.getTitleOfTheItem(),item.getPhotoOfTheItem(),item.getPrice(),item.getHowMuchItemsAvailableInStock());
    }

    @Override
    public void updateItemById(Long id, Item item) throws Exception {
        String sql = "UPDATE " + ITEM_TABLE_NAME + " SET item_id=? ,title_of_the_item=? ,photo_of_the_item=? ,price=? ,how_much_items_available_in_stock=?" +
                "WHERE id=?";
        jdbcTemplate.update(sql,item.getId(),item.getTitleOfTheItem(),item.getPhotoOfTheItem(),item.getPrice(),item.getHowMuchItemsAvailableInStock());
    }

    @Override
    public void deleteItemById(Long id) throws Exception {
        String sql = "DELETE FROM " + ITEM_TABLE_NAME + " WHERE item_id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Item getItemById(Long id) {
        String sql = "SELECT * FROM " + ITEM_TABLE_NAME + " WHERE item_id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new ItemMapper(), id);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }



    @Override
    public List<Item> getAllItems() {
        String sql = "SELECT * FROM " + ITEM_TABLE_NAME ;
        try {
            return jdbcTemplate.query(sql, new ItemMapper());
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }
}
