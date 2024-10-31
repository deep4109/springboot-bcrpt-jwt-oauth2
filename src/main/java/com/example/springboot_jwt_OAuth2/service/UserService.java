package com.example.springboot_jwt_OAuth2.service;

import com.example.springboot_jwt_OAuth2.dao.UserRepo;
import com.example.springboot_jwt_OAuth2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);

    }

    public List<User> getUsers(){
        return repo.findAll();
    }
}
