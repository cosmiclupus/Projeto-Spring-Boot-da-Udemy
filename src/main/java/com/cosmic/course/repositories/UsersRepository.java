package com.cosmic.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmic.course.entities.Users;

public interface UsersRepository extends JpaRepository<Users,Long> {
	
	

}
