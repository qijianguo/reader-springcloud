package com.qijianguo.springcloud.reader.impl;

import com.qijianguo.springcloud.reader.dto.UserDTO;
import com.qijianguo.springcloud.reader.mapper.UserDao;
import com.qijianguo.springcloud.reader.pojo.UserDO;
import com.qijianguo.springcloud.reader.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDTO get(Long id) {
        UserDO userDO = userDao.selectByPrimaryKey(id);
        return new UserDTO().convertFromDO(userDO);
    }

    @Override
    public int delete(Long id) {
        return userDao.deleteByPrimaryKey(id);
    }
}
