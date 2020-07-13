package com.qijianguo.springcloud.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qijianguo
 */
@SpringBootApplication(scanBasePackages = {"com.qijianguo.reader"})
public class ReaderApiSpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderApiSpringCloudApplication.class, args);
    }
}
