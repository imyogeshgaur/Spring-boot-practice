package com.example.fifthapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.example.fifthapp.entity.User;
import com.example.fifthapp.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@Component
public class UserContoller {
    @Autowired(required = true)
    public UserService userService;

    @GetMapping(value="/users")
    public Iterable<User> getMethodName() {
        return this.userService.getAllUsers();
    }
    
    @PostMapping(value="/users")
    public User postMethodName(@RequestBody User entity) {
        return this.userService.createUser(entity.name, entity.email, entity.password, entity.location);
    }

    @PutMapping(value = "/users/{userId}")
    public User putMethodName(@RequestBody User entity,@PathVariable("userId") int uId){
        return this.userService.updateUser(uId,entity.name);
    }

    @DeleteMapping(value = "/users/{userId}")
    public String deleteMethod(@PathVariable("userId") int uId){
        return this.userService.deleteUser(uId);
    }    
    
}
