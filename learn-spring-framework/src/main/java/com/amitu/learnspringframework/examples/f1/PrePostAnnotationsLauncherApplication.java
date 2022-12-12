package com.amitu.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass{
	
	private Dependency dependency;

	public SomeClass(Dependency dependency) {
		super();
		this.dependency = dependency;
		System.out.println("All dependecy initialized");
	}
	
	public void initialize() {
		dependency.getReady();
	}
	
	
}


@Component
class Dependency{

	public void getReady() {
		System.out.println("Some logic using some dependency");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
