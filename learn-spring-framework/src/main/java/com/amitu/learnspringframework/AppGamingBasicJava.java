package com.amitu.learnspringframework;

import com.amitu.learnspringframework.game.GameRunner;
import com.amitu.learnspringframework.game.MarioGame;
import com.amitu.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);

		gameRunner.run();
	}

}
