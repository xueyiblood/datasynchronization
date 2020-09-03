package com.yc.datasynchronization.datasource;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 实战平台数据库配置配置
 */
@Configuration//注册到springboot容器
@MapperScan(basePackages= {"com.yc.datasynchronization.actual.mapper"},sqlSessionFactoryRef="actualSqlSessionFactory")
public class DataSource3Config {
	@Bean(name="actualDataSource")//注入到这个容器
	@ConfigurationProperties(prefix="spring.datasource.actual")//表示取application.properties配置文件中的前缀
	@Primary
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name="actualSqlSessionFactory")
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("actualDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean.getObject();
	}
	@Bean(name="actualTransactionManager")//配置事务
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("actualDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	@Bean(name="actualSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("actualSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
