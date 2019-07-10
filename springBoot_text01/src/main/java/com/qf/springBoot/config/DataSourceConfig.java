package com.qf.springBoot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by ZhangDian on 2019/7/10.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "ds1")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.zhongchou")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();}

    @Bean(name = "ds2")
    @ConfigurationProperties(prefix = "spring.datasource.dianzzz")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }
}
