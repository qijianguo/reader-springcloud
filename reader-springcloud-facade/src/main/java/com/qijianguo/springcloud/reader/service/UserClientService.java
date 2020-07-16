package com.qijianguo.springcloud.reader.service;

import com.qijianguo.springcloud.reader.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "READER-SPRINGCLOUD-WEB", fallbackFactory = UserFeignServiceFallBackFactory.class)
public interface UserClientService {

    @GetMapping("/reader/user/feign/{userId}")
    UserDTO get(@PathVariable("userId") Long userId);

    @DeleteMapping("/reader/user/feign/{userId}")
    int delete(@PathVariable("userId") Long userId);

}
