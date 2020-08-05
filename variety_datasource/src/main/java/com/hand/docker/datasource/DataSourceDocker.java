package com.hand.docker.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration      //注解到Spring容器中
@MapperScan(basePackages = "com.hand.docker.dao",sqlSessionFactoryRef = "dockerSqlSessionFactory")
public class DataSourceDocker {

    @Bean("dockerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.docker")
    public DataSource dataSource(){
        DataSource dataSource = DataSourceBuilder.create().build();
        return dataSource;
    }

    @Bean("dockerSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dockerDataSource")DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        return factory.getObject();
    }

    @Bean("dockerSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("dockerSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
