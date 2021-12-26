package com.example.fundamentosSpring.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImpl implements ComponentDependency {

	@Override
	public void saludar() {
		System.out.print("Hola desde mi componente");
	}
	
}
