package com.joaorobrt.api_ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaorobrt.api_ecomerce.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
