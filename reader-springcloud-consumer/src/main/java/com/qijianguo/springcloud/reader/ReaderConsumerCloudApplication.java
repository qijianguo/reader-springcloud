package com.qijianguo.springcloud.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qijianguo
 */
@SpringBootApplication
@EnableEurekaClient
public class ReaderConsumerCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderConsumerCloudApplication.class, args);
    }
}
