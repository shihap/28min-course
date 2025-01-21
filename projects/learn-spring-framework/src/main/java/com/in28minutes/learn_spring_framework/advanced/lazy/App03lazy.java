package com.in28minutes.learn_spring_framework.advanced.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class classA{

}

@Component
@Lazy // this will make the classB bean to be created only when it is needed
class classB{
    private classA classA;

    public classB(classA classA) {
        System.out.println("some init logic");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
public class App03lazy {
    
    public static void main(String[] args) {
      
        try (var applicationContext = new AnnotationConfigApplicationContext(App03lazy.class)) {
            applicationContext.getBean(classB.class);
            System.out.println("init of context is completed");

            
        }

    }
}
