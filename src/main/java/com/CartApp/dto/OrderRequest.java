package com.CartApp.dto;

import com.CartApp.entity.User;
import lombok.Data;

@Data
public class OrderRequest {

    private User user;
}
