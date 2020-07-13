package com.qijianguo.springcloud.reader.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {

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

    public UserDO(String telphone, String password) {
        this.telphone = telphone;
        this.setPassword(password);
        this.gender = 0;
        this.age = 0;
        this.registerMode = "telphone";
        this.headImgUrl = "";
        this.name = telphone;
        this.thirdPartyId = "";
        this.createDate = new Date();
        this.channelId = 0;
        this.status = 0;
    }

    public UserDO(String unionId, String iosOpenId, String androidOpenId, String headImgUrl, String nickname, int sex, Integer channelId, String hannels) {
        this.telphone = "";
        this.iosOpenId = iosOpenId;
        this.androidOpenId = androidOpenId;
        this.gender = sex;
        this.age = 0;
        this.registerMode = "weixin";
        this.headImgUrl = headImgUrl;
        this.name = nickname;
        this.thirdPartyId = unionId;
        this.createDate = new Date();
        this.channelId = channelId;
        this.hannels = hannels;
        this.status = 0;
    }


}