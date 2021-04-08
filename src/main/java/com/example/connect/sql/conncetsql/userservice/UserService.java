package com.example.connect.sql.conncetsql.userservice;


import com.example.connect.sql.conncetsql.controller.User;
import com.example.connect.sql.conncetsql.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
    ArrayList<User> userArrayList;
    @Autowired
    public UserRepository userRepository;

    public List<User> userList() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
    public void updateUser(User user
            , String id) {
        userRepository.save(user);
    }


}

