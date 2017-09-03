package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by Vardan on 29.07.2017.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }

    public void addUser(User user) {
        String password = user.getPassword();
        String f = new BCryptPasswordEncoder().encode(password);

        user.setPassword(f);
        userRepository.save(user);
    }
    public User create(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userRepository.save(user);
    }

}
