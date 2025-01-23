package com.betus.dbdemo.security.controller;

import com.betus.dbdemo.security.models.UserTable;
import com.betus.dbdemo.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public UserTable register(@RequestBody UserTable user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserTable user) {
        return service.verify(user);
    }

}
