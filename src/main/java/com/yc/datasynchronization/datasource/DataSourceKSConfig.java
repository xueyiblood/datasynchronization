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
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/*
 * @Primary:意思是在众多相同的bean中，优先使用用@Primary注解的bean
 * @Qualifire:让Spring可以按照Bean名称进入注入@Autowired
 */

/**
 * 昆山数据库配置
 */
@Configuration//注册到springboot容器
@MapperScan(basePackages= {"com.yc.datasynchronization.service.detentionhouseks.mapper"},sqlSessionFactoryRef="detentionKSSqlSessionFactory")
public class DataSourceKSConfig {
	@Bean(name="detentionKSDataSource")//注入到这个容器
	@ConfigurationProperties(prefix="spring.datasource.detentionks")//表示取application.properties配置文件中的前缀
	
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name="detentionKSSqlSessionFactory")

	public SqlSessionFactory testSqlSessionFactory(@Qualifier("detentionKSDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean.getObject();
	}
	@Bean(name="detentionKSTransactionManager")//配置事务
	
	public DataSourceTransactionManager testTransactionManager(@Qualifier("detentionKSDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	@Bean(name="detentionKSSqlSessionTemplate")
	
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("detentionKSSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
