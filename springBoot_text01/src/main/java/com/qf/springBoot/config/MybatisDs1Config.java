package com.qf.springBoot.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mapstruct.MapperConfig;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by ZhangDian on 2019/7/10.
 */
@Configuration
@MapperScan(basePackages = {"com.qf.springBoot.dao.ds1"},sqlSessionFactoryRef ="sqlSessionFactory1" )
public class MybatisDs1Config {

    @Autowired
    @Qualifier("ds1")
    private DataSource ds1;

    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(ds1);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/ds1/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    @Primary
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory1());
        return sqlSessionTemplate;
    }

    @Bean(name = "ds1transactionManager")
    @Primary
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("ds1") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

}
