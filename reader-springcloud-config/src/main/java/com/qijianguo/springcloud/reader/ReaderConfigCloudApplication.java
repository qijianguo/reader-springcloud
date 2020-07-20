package com.qijianguo.springcloud.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qijianguo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ReaderConfigCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderConfigCloudApplication.class, args);
    }
}
