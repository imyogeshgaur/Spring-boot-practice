package com.example.loginsignup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginsignup.entity.User;
import com.example.loginsignup.models.UserRepository;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(String name,String email,String password){
        User savedUser = new User();
        savedUser.setUserName(name);
        savedUser.setUserEmail(email);
        savedUser.setUserPasssword(password);
        userRepository.save(savedUser);
        return savedUser;
    }

    public String loginUser(String email,String password){
        User user = userRepository.findByEmail(email);
        if(user.password.compareTo(password)==0){
            return "logged In";
        }
        return "Invalid Credentials";
    }

}
