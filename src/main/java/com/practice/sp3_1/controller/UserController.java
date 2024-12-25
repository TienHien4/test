package com.practice.sp3_1.controller;

import com.practice.sp3_1.Service.UserService;
import com.practice.sp3_1.dto.UserRequest;
import com.practice.sp3_1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User CreateUser(@RequestBody UserRequest request){
        return userService.CreateUser(request);

    }
}
