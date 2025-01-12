package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App01GamingBasic {
    
    public static void main(String[] args) {
        
        // Load the application context with the GamingConfig configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfig.class);

        // Check if beans are properly loaded
        //System.out.println("Available Beans: " + context.getBeanDefinitionNames());

        // Choose which Game bean you want to use
        Game game = (Game) context.getBean("marioGame"); // You can change this to pacmanGame or superContraGame
        
        // Manually pass the selected game to the GameRunner
        GameRunner gameRunner = new GameRunner(game);
        //GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();

        context.close();
    }
}
