package com.in28minutes.learn_spring_framework.advanced.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("all dependencies are ready");
    }

    //after the constructor is called, this method will be called
    @PostConstruct // post constructor
    public void init() {
        someDependency.getReady();
    }

    //before the bean is destroyed, this method will be called
    @PreDestroy // pre destroy
    public void close() {
        System.out.println("clean up");
    }
}

@Component
class SomeDependency{
    
    public SomeDependency() {
        System.out.println("SomeDependency Constructor");
    }

    public void getReady() {
        System.out.println("some logic using SomeDependency");
    }
}


@Configuration
@ComponentScan
public class App05lifecycle {
    
    public static void main(String[] args) {
      
        try (var applicationContext = new AnnotationConfigApplicationContext(App05lifecycle.class)) {
            
           
            
        }

    }
}
