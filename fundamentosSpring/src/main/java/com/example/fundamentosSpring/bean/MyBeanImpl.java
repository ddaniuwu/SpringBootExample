package com.example.fundamentosSpring.bean;

public class MyBeanImpl implements MyBean{

	//Implementation of myBean from interface MyBean
	@Override
	public void Print() {
		System.out.print("\nHola mundo desde la implementacion propia de mi bean");
	}
	
}
