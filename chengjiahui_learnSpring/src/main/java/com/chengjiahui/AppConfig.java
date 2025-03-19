package com.chengjiahui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Description TODO
 * @Auther chengjiahui
 * @Date 2025/3/12 20:06
 * @Version 1.0
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("com.chengjiahui")
public class AppConfig {

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring?useSSL=false&serverTimezone=UTC&characterEncoding=utf8");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("123456789");
		return driverManagerDataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager(){
		return new DataSourceTransactionManager(dataSource());
	}
}
