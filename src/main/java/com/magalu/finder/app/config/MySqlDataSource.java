package com.magalu.finder.app.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ConfigurationProperties(prefix = "app.datasource.mysql")
public class MySqlDataSource extends MagaluFinderDataSource {

	@Bean(name = "mysql")
	@Primary
	public DataSource dataSourceSQLServer() {
		return super.getDataSource();
	}

}
