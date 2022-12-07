package com.amitu.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amitu.learnspringframework.game.GameRunner;
import com.amitu.learnspringframework.game.GamingConfiguration;
import com.amitu.learnspringframework.game.GamingConsole;

public class App03GamingSpringBean {

	public static void main(String[] args) {
	
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
