package com.cosmic.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cosmic.course.entities.Users;
import com.cosmic.course.repositories.UsersRepository;

@Component
public class UsersService {
	
	@Autowired
	private UsersRepository repository;

	public List<Users> findAll(){
		return repository.findAll();
	}
	
	public Users findById(Long id) {
		Optional<Users> obj = repository.findById(id);
		return  obj.get();
	}
	
}
