package com.websiteBService.service;

import com.websiteBService.model.User;

import java.util.List;

public interface WebsiteBSService  {
    Long createUser(User user)throws Exception;
    User getUserById(Long userId) throws Exception;
    void updateUserById(Long userId, User user) throws Exception;
    void deleteUserById(Long userId) throws Exception;

    List<User> getAllUsers();
}
