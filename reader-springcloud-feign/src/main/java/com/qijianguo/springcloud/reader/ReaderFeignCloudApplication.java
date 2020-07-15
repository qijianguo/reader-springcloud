package com.qijianguo.springcloud.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qijianguo
 */
@SpringBootApplication(scanBasePackages = "com.qijianguo.springcloud.reader")
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.qijianguo.springcloud.reader")
public class ReaderFeignCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderFeignCloudApplication.class, args);
    }
}
