package com.magalu.finder.app.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;

public class MagaluFinderDataSource {
	private String url;
	private String userName;
	private String password;

	public DataSource getDataSource() {
		return DataSourceBuilder
				.create()
				.url(getUrl())
				.username(getUserName())
				.password(getPassword())
				.build();
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
