package com.qijianguo.springcloud.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author qijianguo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class ReaderDashboardCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderDashboardCloudApplication.class, args);
    }
}