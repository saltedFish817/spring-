package com.qf.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

/**
 * Created by ZhangDian on 2019/7/8.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class,args);
    }
}
