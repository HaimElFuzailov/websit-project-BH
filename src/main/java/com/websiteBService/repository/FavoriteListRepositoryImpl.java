package com.websiteBService.repository;

import com.websiteBService.model.FavoriteList;
import com.websiteBService.repository.mapper.FavoriteListMapper;
import com.websiteBService.repository.mapper.FavoriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FavoriteListRepositoryImpl implements FavoriteListRepository{

    private static final String FAVORITE_LIST_TABLE_NAME = "favorite_list";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createFavoriteList(FavoriteList favoriteList) {
        String sql = "INSERT INTO " + FAVORITE_LIST_TABLE_NAME + " (favorite_list_id ,item_id ) VALUES (?,?)";
        jdbcTemplate.update(sql,favoriteList.getFavoriteListId(),favoriteList.getItemId());
    }

    @Override
    public void updateFavoriteListById(Long id, FavoriteList favoriteList) throws Exception {
        String sql = "UPDATE " + FAVORITE_LIST_TABLE_NAME + " SET favorite_list_id=? ,item_id=?" + "WHERE id=?";
        jdbcTemplate.update(sql,favoriteList.getFavoriteListId(),favoriteList.getItemId());
    }

    @Override
    public void deleteFavoriteListById(Long id) throws Exception {
        String sql = "DELETE FROM " + FAVORITE_LIST_TABLE_NAME + " WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public FavoriteList getFavoriteListById(Long id) {
        String sql = "SELECT * FROM " + FAVORITE_LIST_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new FavoriteListMapper(), id);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }
}
