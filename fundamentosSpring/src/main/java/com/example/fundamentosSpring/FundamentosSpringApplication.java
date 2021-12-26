package com.example.fundamentosSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.fundamentosSpring.component.ComponentDependency;


@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner{
	
	private ComponentDependency componentDependency;
	
	public FundamentosSpringApplication(ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringApplication.class, args);
	} 
	
	@Override
	public void run(String... args){
		componentDependency.saludar();
	}

}
