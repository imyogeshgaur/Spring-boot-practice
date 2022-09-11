package com.example.loginsignup.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.loginsignup.entity.User;

@Repository
public interface UserRepository extends  CrudRepository<User ,Integer>{ 
    public User findByEmail(String email);
}
