package com.example.demo.controller;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Vardan on 29.07.2017.
 */
@Controller
public class UserController {

@Autowired
    UserService userService;

@RequestMapping(value = "/user/register", method = RequestMethod.POST)
public String addUser(@ModelAttribute User user){
//    user.setRole(Role.USER);
    userService.addUser(user);
    return "redirect:/";
}
}
