package com.java.prac.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.java.prac.*")
@PropertySource("classpath:database.properties")
public class AppConfig
{
	@Autowired
	Environment environment;
	
	public final String URL="url";
	public final String DRIVER="driver";
	public final String USER="dbuser";
	public final String PASSWORD="password";
	
	@Bean
	public DataSource datasource()
	{
		System.out.println("***********dataSource method*************");
		DriverManagerDataSource drivermanagerdatasource=new DriverManagerDataSource();
		drivermanagerdatasource.setUrl(environment.getProperty(URL));
		drivermanagerdatasource.setDriverClassName(environment.getProperty(DRIVER));
		drivermanagerdatasource.setUsername(environment.getProperty(USER));
		drivermanagerdatasource.setPassword(environment.getProperty(PASSWORD));
		return drivermanagerdatasource;
	}
	@Bean
	@Autowired
	public JdbcTemplate getjdbcTemplate(DataSource datasource)
	{
		System.out.println("*************JdbcTemplate****************");
		return new JdbcTemplate(datasource);
	}
}
