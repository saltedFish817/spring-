package com.qf.springBoot.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by ZhangDian on 2019/7/10.
 */
@ApiModel(value = "账户对象")
@Data
public class Account {
    /*`id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `balance` double(6,2) DEFAULT NULL,*/
    private int id;
    private String name;
    private BigDecimal balance;
}
