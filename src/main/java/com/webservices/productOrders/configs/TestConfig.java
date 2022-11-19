package com.webservices.productOrders.configs;

import com.webservices.productOrders.entities.User;
import com.webservices.productOrders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "User 1", "user1@gmail.com", "999999999", "123456");
        User u2 = new User(null, "User 2", "user2@gmail.com", "000000000", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
