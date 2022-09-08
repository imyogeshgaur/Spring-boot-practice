package com.example.fourthapp.service;

import org.springframework.data.repository.CrudRepository;

import com.example.fourthapp.entity.User;

public interface UserService extends CrudRepository<User,Integer>{
    
}
