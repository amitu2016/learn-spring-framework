package com.amitu.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Go inside hole");
	}

	public void left() {
		System.out.println("Move backward");
	}

	public void right() {
		System.out.println("Accelerate");
	}

}
