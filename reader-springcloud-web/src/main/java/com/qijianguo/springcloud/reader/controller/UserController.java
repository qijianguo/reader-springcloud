package com.qijianguo.springcloud.reader.controller;

import com.qijianguo.springcloud.reader.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Object get(Long userId) {
        return userService.get(userId);
    }


    /* ------ 服务发现(了解) ---------*/
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/discovery")
    public Object getDiscovery(Long userId) {
        List<String> services = client.getServices();
        log.info("******" + services);

        String serviceId = "READER-SPRINGCLOUD-WEB";
        List<ServiceInstance> instances = client.getInstances(serviceId);
        for (ServiceInstance instance : instances) {
            log.info("SERVICE_ID: {}, HOST: {} PORT: {} + URI: {}", instance.getServiceId(), instance.getHost(), instance.getPort(), instance.getUri());
        }
        return this.client;
    }
    /* ------ 服务发现 ---------*/

}
