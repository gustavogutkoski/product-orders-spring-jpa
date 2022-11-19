package com.webservices.productOrders.resources;

import com.webservices.productOrders.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "User Test", "test@gmail.com", "999999999", "test");
    return ResponseEntity.ok().body(u);
    }
}
