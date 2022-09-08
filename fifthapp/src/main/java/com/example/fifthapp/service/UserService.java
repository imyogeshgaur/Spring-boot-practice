package com.example.fifthapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fifthapp.entity.User;
import com.example.fifthapp.models.UserRepository;

@Service
public class UserService {
    @Autowired(required = true)
    public UserRepository userRepository;

    public User createUser(String uname,String uemail,String upass,String ulocation){
        User user = new User();
        user.setEmail(uemail);
        user.setName(uname);
        user.setLocation(ulocation);
        user.setPassword(upass);
        
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public Iterable<User> getAllUsers(){
        Iterable<User> users  = userRepository.findAll();
        return users;
    }

    public User updateUser(int uId,String name){
        User userToChange = userRepository.findById(uId).get();
        userToChange.setName(name);
        User userSaved = userRepository.save(userToChange);
        return userSaved;
    }

    public String deleteUser(int uId){
        User userToDelete = userRepository.findById(uId).get();
        userRepository.delete(userToDelete);
        return "User Of Id " + uId + " deleted Successfully !!!";
    }
}
