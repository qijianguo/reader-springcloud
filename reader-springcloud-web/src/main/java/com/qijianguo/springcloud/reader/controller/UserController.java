package com.qijianguo.springcloud.reader.controller;

import com.qijianguo.springcloud.reader.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Object get(Long userId) {
        return userService.get(userId);
    }
}
