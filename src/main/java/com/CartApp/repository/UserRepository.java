package com.CartApp.repository;


import com.CartApp.dto.OrderResponse;
import com.CartApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT new com.CartApp.dto.OrderResponse(c.userName, p.pname) FROM User c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
