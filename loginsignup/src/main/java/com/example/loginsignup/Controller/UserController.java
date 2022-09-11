package com.example.loginsignup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginsignup.entity.User;
import com.example.loginsignup.services.UserServices;

@RestController
public class UserController {
    @Autowired
    private UserServices userService;
    @PostMapping("/signup")
    public User Signup(@RequestBody User user){
        return this.userService.registerUser(user.name, user.email, user.password);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user){
        return this.userService.loginUser(user.email, user.password);
    }
}
