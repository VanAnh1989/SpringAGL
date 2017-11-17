package com.example.demo.configuration;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan(basePackages= {"com.example.demo.configuration"})
public class Dataconfiguration {
	
	@Bean
	public SqlSessionFactory sessionFactory() throws Exception{
		final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(padDataSource());
		return sessionFactoryBean.getObject();
	}
	
	@Bean 
	public DataSource padDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/mybatis");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
		return dataSource;		
	}
	
}
