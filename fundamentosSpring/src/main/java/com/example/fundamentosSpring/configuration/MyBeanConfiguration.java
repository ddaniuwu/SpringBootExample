package com.example.fundamentosSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.fundamentosSpring.bean.MyBean;
import com.example.fundamentosSpring.bean.MyBeanImpl;

@Configuration
public class MyBeanConfiguration {
	
	@Bean
	public MyBean beanOperation() {
		return new MyBeanImpl();
	}
}
