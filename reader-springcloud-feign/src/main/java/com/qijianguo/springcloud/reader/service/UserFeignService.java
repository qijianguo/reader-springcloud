package com.qijianguo.springcloud.reader.service;

import com.qijianguo.springcloud.reader.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "READER-SPRINGCLOUD-WEB")
public interface UserFeignService {

    /**
     * 根据ID查询
     * @param userId
     * @return
     */
    @GetMapping("/reader/user/feign/ {userId}")
    UserDTO get(@PathVariable("userId") Long userId);

}
