package com.webservices.productOrders.repositories;

import com.webservices.productOrders.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
