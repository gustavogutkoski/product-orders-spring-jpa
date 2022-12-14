package com.webservices.productOrders.configs;

import com.webservices.productOrders.entities.Category;
import com.webservices.productOrders.entities.Order;
import com.webservices.productOrders.entities.User;
import com.webservices.productOrders.entities.enums.OrderStatus;
import com.webservices.productOrders.repositories.CategoryRepository;
import com.webservices.productOrders.repositories.OrderRepository;
import com.webservices.productOrders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "User 1", "user1@gmail.com", "999999999", "123456");
        User u2 = new User(null, "User 2", "user2@gmail.com", "000000000", "123456");

        Order o1 = new Order(null, Instant.parse("2022-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"), OrderStatus.SHIPPED, u2);
        Order o3 = new Order(null, Instant.parse("2022-07-22T15:21:22Z"), OrderStatus.CANCELED, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));

        orderRepository.saveAll((Arrays.asList(o1, o2, o3)));

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
