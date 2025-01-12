package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfig {

    @Bean
    public Game pacmanGame() {
        return new PacmanGame();
    }

    
    @Bean
    public Game marioGame() {
        return new MarioGame();
    }
    

    @Bean
    public Game superContraGame() {
        return new SuperContraGame();
    }
    
    /*
    @Bean
    public GameRunner gameRunner(Game game) {
        return new GameRunner(game);
    }
    */
    
}
