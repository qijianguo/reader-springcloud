package com.qijianguo.springcloud.reader.mapper;

import com.qijianguo.springcloud.reader.pojo.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void selectByPrimaryKey() {
        UserDO userDO = userDao.selectByPrimaryKey(57L);
        System.out.println(userDO);
    }

    @Test
    public void deleteByPrimaryKey() {
        UserDO userDO = userDao.selectByPrimaryKey(-1L);
        System.out.println(userDO);
    }
}