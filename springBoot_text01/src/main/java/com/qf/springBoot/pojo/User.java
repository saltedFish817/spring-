package com.qf.springBoot.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created by ZhangDian on 2019/7/8.
 */
@ApiModel(value = "用户对象")
@Data
public class User {

    private int uid;
    private String uname;
    private String upow;
    private String email;

}
