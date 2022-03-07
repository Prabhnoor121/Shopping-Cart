package com.CartApp.controller;

import com.CartApp.entity.User;
import com.CartApp.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;
import java.util.logging.Logger;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //private final Logger LOGGER= (Logger) LoggerFactory.getLogger(UserController.class);


//    @PostMapping("/users")
//    public User saveUser(@RequestBody User user){
//        //LOGGER.info((Supplier<String>) user);
//        return userService.saveUser(user);
//    }
}
