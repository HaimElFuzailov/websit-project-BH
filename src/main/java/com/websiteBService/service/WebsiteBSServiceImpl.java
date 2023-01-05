package com.websiteBService.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.websiteBService.model.User;
import com.websiteBService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebsiteBSServiceImpl implements WebsiteBSService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public Long createUser(User user) throws Exception {
        userRepository.createUser(user);
        return null;
    }

    @Override
    public User getUserById(Long userId) throws Exception {
        return  userRepository.getUserById(userId);
    }

    @Override
    public void updateUserById(Long userId, User user) throws Exception {
        userRepository.updateUserById(userId, user);
    }

    @Override
    public void deleteUserById(Long userId) throws Exception {
        userRepository.deleteUserById(userId);
    }

    @Override
    public List<User> getAllUsers() { return userRepository.getAllUsers(); }
}
