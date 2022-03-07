package com.CartApp.service;

import com.CartApp.dto.OrderResponse;
import com.CartApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<OrderResponse> getJoinInformation() {
        return userRepository.getJoinInformation();
    }
}
