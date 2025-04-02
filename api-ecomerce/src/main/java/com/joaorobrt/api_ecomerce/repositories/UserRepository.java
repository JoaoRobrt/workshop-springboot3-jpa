package com.joaorobrt.api_ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaorobrt.api_ecomerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
