package com.example.fundamentosSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.fundamentosSpring.bean.MyBean;
import com.example.fundamentosSpring.bean.MyBeanImpl;

//Configuraion for the implementation of a Bean 
@Configuration
public class MyBeanConfiguration {
	
	@Bean
	public MyBean beanOperation() {
		//it returns the class that implements the Bean
		return new MyBeanImpl();
	}
}
