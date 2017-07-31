package com.example.demo.service.currentUser;

import com.example.demo.entity.CurrentUser;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Vardan on 29.07.2017.
 */
@Service
public class CurrentUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public CurrentUser loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userService.getUserByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User with email=%S not found", email));

        }
        return new CurrentUser(user);

    }
}
