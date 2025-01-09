package com.in28minutes.learn_spring_framework;

public class GameRunner {
    MarioGame game;

    public GameRunner(MarioGame game){
        this.game=game;
    }

    public void run(){
        System.out.println("Running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
