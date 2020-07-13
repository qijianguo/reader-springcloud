package com.qijianguo.springcloud.reader;

import com.qijianguo.springcloud.reader.service.UserService;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author qijianguo
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserService.class)
public class ReaderServiceTest {

    public static void main(String[] args) {
        SpringApplication.run(ReaderServiceTest.class, args);
    }
}
