package com.correajulian.conferencedemo.configs;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
	@Bean
	public DataSource dataSource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:postgresql://192.168.1.2:5432/conference_app");
		builder.username("Julian");
		builder.password("Secret2!");
		System.out.println("Config bean loaded");
		return builder.build();
	}
}
