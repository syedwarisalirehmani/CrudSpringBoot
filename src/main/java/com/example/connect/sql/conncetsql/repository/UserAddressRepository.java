package com.example.connect.sql.conncetsql.repository;

import com.example.connect.sql.conncetsql.controller.Address;
import org.springframework.data.repository.CrudRepository;

public interface UserAddressRepository extends CrudRepository<Address,Integer> {
}
