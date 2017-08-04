package com.example.demo.repository;


import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vardan on 25.07.2017.
 */
public interface UserRepository  extends JpaRepository<User, Long> {

    User findByEmail(String email);


}
