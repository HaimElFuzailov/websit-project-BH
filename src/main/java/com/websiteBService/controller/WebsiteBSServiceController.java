package com.websiteBService.controller;


import com.websiteBService.model.User;
import com.websiteBService.repository.UserRepository;
import com.websiteBService.service.WebsiteBSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/website/user")
public class WebsiteBSServiceController {
        @Autowired
        private WebsiteBSService websiteBSService;

        @PostMapping(value = "/create")
        public void createUser(@RequestBody User user) throws Exception {
            websiteBSService.createUser(user);
        }

        @PutMapping(value = "/{userId}/update")
        public void updateUserById(@PathVariable Long userId,
                                       @RequestBody User user) throws Exception {
            websiteBSService.updateUserById(userId, user);
        }

        @DeleteMapping(value = "/{userId}/delete")
        public void deleteUserById(@PathVariable Long userId) throws Exception {
            websiteBSService.deleteUserById(userId);
        }

        @GetMapping(value = "/{userId}")
        public User getUserById(@PathVariable Long userId) throws Exception {
            return websiteBSService.getUserById(userId);
        }

        @GetMapping(value = "/all")
        public List<User> getAllUsers(){
            return websiteBSService.getAllUsers();
        }
}
