package com.qijianguo.springcloud.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qijianguo
 */
@SpringBootApplication
@EnableEurekaServer
public class ReaderEurekaCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderEurekaCloudApplication.class, args);
    }
}
