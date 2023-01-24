package com.rpa.api_rpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.rpa.api_rpa.security.JwtFilter;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ApiRpaApplication {
	@Autowired
	private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(ApiRpaApplication.class, args);
	}

	// @Bean
	// public FilterRegistrationBean jwtFilter() {
	// 	final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	// 	registrationBean.setFilter(new JwtFilter(env));
	// 	registrationBean.addUrlPatterns("/*");
	// 	return registrationBean;
	// }

}
