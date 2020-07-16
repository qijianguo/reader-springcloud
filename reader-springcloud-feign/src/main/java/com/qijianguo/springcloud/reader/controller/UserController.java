package com.qijianguo.springcloud.reader.controller;

import com.qijianguo.springcloud.reader.service.UserClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class  UserController {

    @Autowired
    private UserClientService userClientService;

    @GetMapping("/user/{userId}")
    public Object get(@PathVariable("userId") Long userId) {
        return userClientService.get(userId);
    }

}
