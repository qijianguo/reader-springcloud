package com.qijianguo.springcloud.reader.controller;

import com.qijianguo.springcloud.reader.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController("/consumer/user")
public class UserController {

    // private static final String REST_URL = "http://localhost:10001";
    private static final String REST_URL = "http://READER-SPRINGCLOUD-WEB";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Object get(Long userId) {
        // http://localhost:18888/consumer/user?userId=87

        String url = REST_URL + "/reader/user?userId="+userId;
        /*Map<String, Object> params = new HashMap<>();
        params.put("userId", userId);
        UserDTO userDTO = restTemplate.getForObject("http://localhost:18888/consumer/user", UserDTO.class, params);
        System.out.println(userDTO);*/

        UserDTO dto = restTemplate.getForObject(url, UserDTO.class);
        return dto;
    }
}
