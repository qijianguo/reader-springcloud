package com.qijianguo.springcloud.reader.service;

import com.qijianguo.springcloud.reader.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void get() {
        UserDTO dto = userService.get(57L);
        System.out.println(dto);
    }

    @Test
    public void delete() {
    }
}