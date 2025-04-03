package com.joaorobrt.api_ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaorobrt.api_ecomerce.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
