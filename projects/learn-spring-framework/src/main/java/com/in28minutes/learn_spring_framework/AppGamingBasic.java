package com.in28minutes.learn_spring_framework;

public class AppGamingBasic {
    public static void main(String[] args) {
        
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
