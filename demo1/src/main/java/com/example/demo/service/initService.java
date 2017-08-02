package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class initService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;


    @PostConstruct
    public void init(){
        Role role =new Role("ADMIN");
        roleRepository.save(role);
        Role role1 =new Role("USER");
        roleRepository.save(role1);


        User user = new User("mati@wp.pl", passwordEncoder.encode("mati"), role);
        userRepository.save(user);
        role.getUsers().add(user);
        roleRepository.save(role);
        //User user = new User()
    }
}
