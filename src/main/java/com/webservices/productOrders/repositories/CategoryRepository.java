package com.webservices.productOrders.repositories;

import com.webservices.productOrders.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
