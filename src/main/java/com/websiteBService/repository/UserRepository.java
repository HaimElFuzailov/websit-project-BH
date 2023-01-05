package com.websiteBService.repository;
import com.websiteBService.model.User;

import java.util.List;


public interface UserRepository {

    void createUser(User user)throws Exception;
    User getUserById(Long userId) throws Exception;
    void updateUserById(Long userId, User user) throws Exception;
    void deleteUserById(Long userId) throws Exception;

    List<User> getAllUsers();
}
