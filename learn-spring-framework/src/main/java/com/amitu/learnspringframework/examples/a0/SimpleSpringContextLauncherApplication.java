package com.amitu.learnspringframework.examples.a0;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.amitu.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.amitu.learnspringframework.examples.a1")
public class SimpleSpringContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {

		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}