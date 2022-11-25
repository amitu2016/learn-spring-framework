package com.amitu.learnspringframework;

import com.amitu.learnspringframework.game.GameRunner;
import com.amitu.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);

		gameRunner.run();
	}

}
