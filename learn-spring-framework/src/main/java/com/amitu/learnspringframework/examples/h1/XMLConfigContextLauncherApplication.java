package com.amitu.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLConfigContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
