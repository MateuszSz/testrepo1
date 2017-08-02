package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void insert(User user){
        userRepository.save(user);
    }

    public User findUserByEmail(String name) {
        return  userRepository.findByEmail(name);
    }
}
