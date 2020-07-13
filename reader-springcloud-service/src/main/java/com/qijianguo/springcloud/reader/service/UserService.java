package com.qijianguo.springcloud.reader.service;

import com.qijianguo.springcloud.reader.dto.UserDTO;

public interface UserService {

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    UserDTO get(Long id);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    int delete(Long id);
}
