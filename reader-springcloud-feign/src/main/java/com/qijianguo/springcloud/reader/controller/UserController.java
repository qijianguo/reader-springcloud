package com.qijianguo.springcloud.reader.controller;

import com.qijianguo.springcloud.reader.service.UserFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/user/{userId}")
    public Object get(@PathVariable("userId") Long userId) {
        return userFeignService.get(userId);
    }

}
