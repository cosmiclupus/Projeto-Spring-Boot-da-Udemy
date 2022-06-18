package com.cosmic.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmic.course.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {
	
	@GetMapping
	public ResponseEntity<Users> findAll(){
		Users u = new Users(1L, "Juan" , "juan@gmail.com","88888888", "12345");
		return ResponseEntity.ok().body(u);
	}

}
