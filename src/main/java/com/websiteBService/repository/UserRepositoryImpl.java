package com.websiteBService.repository;

import com.websiteBService.model.User;
import com.websiteBService.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

        private static final String USER_SIGN_TABLE_NAME = "user_sign";

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Override
        public void createUser(User user) {
            String sql = "INSERT INTO " + USER_SIGN_TABLE_NAME + " (first_name, last_name, email, phone, address ) VALUES (?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhone(), user.getAddress());
        }

    @Override
    public User getUserById(Long userId) throws Exception {
        String sql = "SELECT * FROM " + USER_SIGN_TABLE_NAME + " WHERE user_id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new UserMapper(), userId);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }


    @Override
    public void updateUserById(Long userId, User user) throws Exception {
        String sql = "UPDATE " + USER_SIGN_TABLE_NAME + " SET first_name=?, last_name=?, email=?, phone=?, address=? " +
                "WHERE user_id=?";
        jdbcTemplate.update(sql,user.getId(),user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhone(), user.getAddress());
    }

    @Override
    public void deleteUserById(Long userId) throws Exception {
        String sql = "DELETE FROM " + USER_SIGN_TABLE_NAME + " WHERE user_id=?";
        jdbcTemplate.update(sql, userId);
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM " + USER_SIGN_TABLE_NAME;
        try {
            return jdbcTemplate.query(sql, new UserMapper());
        } catch (EmptyResultDataAccessException error) {
            return null;
        }
    }
}







