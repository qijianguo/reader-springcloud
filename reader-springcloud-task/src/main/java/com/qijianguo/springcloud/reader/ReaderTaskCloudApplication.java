package com.qijianguo.springcloud.reader;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qijianguo
 */
@SpringBootApplication
@MapperScan("com.qijianguo.springcloud.reader.mapper")
public class ReaderTaskCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReaderTaskCloudApplication.class, args);
    }
}
