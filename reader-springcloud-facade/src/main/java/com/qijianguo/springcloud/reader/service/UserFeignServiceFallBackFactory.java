package com.qijianguo.springcloud.reader.service;

import com.qijianguo.springcloud.reader.dto.UserDTO;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author qijianguo
 * 用户业务服务降级
 */
@Component
public class UserFeignServiceFallBackFactory implements FallbackFactory<UserClientService> {

    @Override
    public UserClientService create(Throwable throwable) {
        return new UserClientService() {
            @Override
            public UserDTO get(Long id) {
                UserDTO userDTO = new UserDTO();
                userDTO.setId(-1L);
                return userDTO;
            }

            @Override
            public int delete(Long userId) {
                return -1;
            }

        };
    }
}