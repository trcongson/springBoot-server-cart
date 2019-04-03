package com.deha.servercart.service;

import com.deha.servercart.model.User;
import com.deha.servercart.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);

}
