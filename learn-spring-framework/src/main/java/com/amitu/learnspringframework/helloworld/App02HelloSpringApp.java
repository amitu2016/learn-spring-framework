package com.amitu.learnspringframework.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpringApp {

	public static void main(String[] args) {
		
		
		
		try (var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class)) {
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2"));
			
			System.out.println(context.getBean("person3"));
			
			System.out.println(context.getBean("address"));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
