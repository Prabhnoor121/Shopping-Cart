package com.CartApp.controller;

import com.CartApp.dto.OrderRequest;
import com.CartApp.dto.OrderResponse;
import com.CartApp.entity.User;
import com.CartApp.repository.ProductRepository;
import com.CartApp.repository.UserRepository;
import com.CartApp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public User placeOrder(@RequestBody OrderRequest request){
        return userRepository.save(request.getUser());
    }

    @GetMapping("/findAllOrders")
    public List<User> findAllOrders(){
        return userRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return orderService.getJoinInformation();
    }
}
