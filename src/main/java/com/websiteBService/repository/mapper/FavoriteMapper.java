package com.websiteBService.repository.mapper;

import com.websiteBService.model.Favorite;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FavoriteMapper implements RowMapper<Favorite> {
    @Override
    public Favorite mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Favorite(
                rs.getLong("favorite_id"),
                rs.getLong("user_id")
        );
    }
}
