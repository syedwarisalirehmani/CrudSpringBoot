package com.example.connect.sql.conncetsql.controller;

import com.example.connect.sql.conncetsql.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> userList() {
        return userService.userList();
    }

    @RequestMapping(method = RequestMethod.POST ,value = "/users")
    private void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "users/{id}")
    private void updateUser(User user, @PathVariable("id") String id) {
        userService.updateUser(user, id);
    }
}
