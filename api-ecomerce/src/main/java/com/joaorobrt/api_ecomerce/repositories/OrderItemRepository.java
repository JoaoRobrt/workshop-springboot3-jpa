package com.joaorobrt.api_ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaorobrt.api_ecomerce.entities.OrderItem;
import com.joaorobrt.api_ecomerce.entities.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
