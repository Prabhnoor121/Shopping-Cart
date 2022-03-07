package com.CartApp.controller;

import com.CartApp.dto.CartRequest;
import com.CartApp.entity.User;
import com.CartApp.repository.CartRepository;
import com.CartApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartRepository cartRepository;

//    @PostMapping("/addToCart/{id}")
//    public User AddToCart(@PathVariable("id") Long userId){
//        User x=userRepository.getById(userId);
//        return cartRepositor
//    }
}
