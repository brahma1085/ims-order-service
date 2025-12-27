package com.example.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orders.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
