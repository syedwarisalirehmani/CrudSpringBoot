package com.example.connect.sql.conncetsql.repository;

import com.example.connect.sql.conncetsql.controller.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
