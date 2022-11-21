package com.webservices.productOrders.repositories;

import com.webservices.productOrders.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
