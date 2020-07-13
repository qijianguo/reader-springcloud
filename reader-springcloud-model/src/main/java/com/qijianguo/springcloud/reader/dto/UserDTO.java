package com.qijianguo.reader.dto;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.qijianguo.reader.pojo.UserDO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
public class UserDTO {

    private Long id;

    private String uid;

    private String name;

    private String realName;

    private Integer gender;

    private Integer age;

    private String telphone;

    private String headImgUrl;

    private String registerMode;

    private String thirdPartyId;

    private String iosOpenId;

    private String androidOpenId;

    private String password;

    private Date createDate;

    private Integer channelId;

    private String hannels;

    private Integer status;

    public UserDTO convertFromDO(UserDO userDO) {
        if (userDO == null) {
            return null;
        }
        BeanUtils.copyProperties(userDO, this);
        return this;
    }
}
