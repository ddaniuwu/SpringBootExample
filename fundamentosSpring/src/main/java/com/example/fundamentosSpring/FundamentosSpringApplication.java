package com.example.fundamentosSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.fundamentosSpring.component.ComponentDependency;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner{
	
	private ComponentDependency ComponentDependency;
	
	public FundamentosSpringApplication(ComponentDependency ComponentDependency){
		this.ComponentDependency = ComponentDependency;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringApplication.class, args);
	} 
	
	@Override
	public void run(String... args){
		ComponentDependency.Saludar();
	}

}
