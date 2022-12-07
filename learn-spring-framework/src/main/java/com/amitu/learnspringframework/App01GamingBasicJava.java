package com.amitu.learnspringframework;

import com.amitu.learnspringframework.game.GameRunner;
import com.amitu.learnspringframework.game.MarioGame;
import com.amitu.learnspringframework.game.PackManGame;
import com.amitu.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PackManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
