package com.websiteBService.repository;

import com.websiteBService.model.Favorite;
import com.websiteBService.repository.mapper.FavoriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FavoriteRepositoryImpl implements FavoriteRepository {
    private static final String FAVORITE_TABLE_NAME = "favorite";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void createFavorite(Favorite favorite) {
        String sql = "INSERT INTO " + FAVORITE_TABLE_NAME + " (favorite_id ,item_id ) VALUES (?,?)";
        jdbcTemplate.update(sql,favorite.getId(),favorite.getItemId());
    }

    @Override
    public void updateFavoriteById(Long id, Favorite favorite) throws Exception {
        String sql = "UPDATE " + FAVORITE_TABLE_NAME + " SET favorite_id=? ,item_id=?" + "WHERE id=?";
        jdbcTemplate.update(sql,favorite.getId(),favorite.getItemId());

    }

    @Override
    public void deleteFavoriteById(Long id) throws Exception {
        String sql = "DELETE FROM " + FAVORITE_TABLE_NAME + " WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Favorite getFavoriteById(Long id) {
        String sql = "SELECT * FROM " + FAVORITE_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new FavoriteMapper(), id);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }
}
