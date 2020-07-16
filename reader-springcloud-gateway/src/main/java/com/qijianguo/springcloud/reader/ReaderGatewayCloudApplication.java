package com.qijianguo.springcloud.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author qijianguo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ReaderGatewayCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderGatewayCloudApplication.class, args);
    }
}
