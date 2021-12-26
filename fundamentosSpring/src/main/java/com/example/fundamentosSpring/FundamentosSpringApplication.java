package com.example.fundamentosSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.fundamentosSpring.bean.MyBean;
import com.example.fundamentosSpring.component.ComponentDependency;


@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner{
	
	//Dependencies inyection
	private ComponentDependency componentDependency;
	private MyBean myBean;
	
	public FundamentosSpringApplication(ComponentDependency componentDependency, MyBean myBean){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringApplication.class, args);
	} 
	
	// calls every method implemented in an Iterface
	@Override
	public void run(String... args){
		componentDependency.saludar();
		myBean.Print();
	}

}
