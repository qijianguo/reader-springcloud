package com.qijianguo.springcloud.reader.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author qijianguo
 */
@Data
@Accessors(chain = true)// 链式
public class Dept implements Serializable {

    private Long no;

    private String name;

    private String dbName;

}
