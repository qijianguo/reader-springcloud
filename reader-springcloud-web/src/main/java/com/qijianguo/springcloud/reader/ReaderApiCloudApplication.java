package com.qijianguo.springcloud.reader;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qijianguo
 */
@SpringBootApplication
@MapperScan("com.qijianguo.springcloud.reader.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class ReaderApiCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderApiCloudApplication.class, args);
    }
}
