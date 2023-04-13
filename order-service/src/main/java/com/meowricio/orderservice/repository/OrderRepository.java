package com.meowricio.orderservice.repository;

import com.meowricio.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
