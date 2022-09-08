package com.example.fifthapp.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fifthapp.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> { }
