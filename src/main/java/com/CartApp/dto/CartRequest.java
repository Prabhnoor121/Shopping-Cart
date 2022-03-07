package com.CartApp.dto;

import com.CartApp.entity.User;
import lombok.Data;

@Data
public class CartRequest {
    public User user;
}
