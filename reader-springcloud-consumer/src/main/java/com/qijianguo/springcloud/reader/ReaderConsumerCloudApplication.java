package com.qijianguo.springcloud.reader;

import com.qijianguo.rule.CustomerRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author qijianguo
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "READER-SPRINGCLOUD-WEB", configuration = CustomerRibbonRule.class)
public class ReaderConsumerCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderConsumerCloudApplication.class, args);
    }
}
