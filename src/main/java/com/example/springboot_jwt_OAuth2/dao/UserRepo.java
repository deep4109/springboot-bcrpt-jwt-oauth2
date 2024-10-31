package com.example.springboot_jwt_OAuth2.dao;

import com.example.springboot_jwt_OAuth2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
