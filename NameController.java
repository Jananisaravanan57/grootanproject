package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Name;

import com.example.demo.repository.NameRepository;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")
public class NameController {
	
	@Autowired
	NameRepository nameRepository;

	@GetMapping("/name/view")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<List<Name>> getAllNames() {
		try {
			List<Name> namesList = new ArrayList<Name>();
			namesList = nameRepository.findAll();
			return new ResponseEntity<>(namesList, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@CrossOrigin(origins = "http://localhost:3000")

	@PostMapping("/register")
	public ResponseEntity<Name> createEmployee(@RequestBody Name name) {
		try {
			name = nameRepository.save(new Name(name.getname(),name.getage(),name.getdob(),name.getfirstName(),name.getlastName(),name.getaddress_line1(),name.getaddress_line2(),name.getaddress_line3(),name.getphone()));
			return new ResponseEntity<>(name, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
