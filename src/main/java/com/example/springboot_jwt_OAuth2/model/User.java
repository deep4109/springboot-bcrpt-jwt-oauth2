package com.example.springboot_jwt_OAuth2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Table(name = "users")
@Entity
public class User {
	
	@Id
	private int id;
	private String username;
	private String password;
	
}
