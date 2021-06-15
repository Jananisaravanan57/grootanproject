package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;

import com.example.demo.repository.LoginRepository;


@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")

public class LoginController {
	@Autowired
	LoginRepository loginRepository;

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<HttpStatus> loginUser(@Validated @RequestBody Login login) {
        List<Login> logins = loginRepository.findAll();
        for (Login other : logins) {
            if (other.getUser_Name().equals(login.getUser_Name()) && other.getPassword().equals(login.getPassword())) {
            	loginRepository.save(login);
                return new ResponseEntity<>( HttpStatus.OK);
            }
        }
        return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
