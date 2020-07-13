package com.qijianguo.springcloud.reader.mapper;

import com.qijianguo.springcloud.reader.pojo.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);
}
