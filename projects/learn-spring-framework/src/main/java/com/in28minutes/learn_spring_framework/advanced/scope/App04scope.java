package com.in28minutes.learn_spring_framework.advanced.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Scope("prototype")
@Component
class PrototypeClass{

}

@Configuration
@ComponentScan
public class App04scope {
    
    public static void main(String[] args) {
      
        try (var applicationContext = new AnnotationConfigApplicationContext(App04scope.class)) {
            
            //singleton -> the same instance of bean is returned each time we get it
            System.out.println(applicationContext.getBean(NormalClass.class));
            System.out.println(applicationContext.getBean(NormalClass.class));
            System.out.println(applicationContext.getBean(NormalClass.class));
            System.out.println("--------------------");
            //prototype -> new instance from the bean is created each time we get it
            System.out.println(applicationContext.getBean(PrototypeClass.class));
            System.out.println(applicationContext.getBean(PrototypeClass.class));
            System.out.println(applicationContext.getBean(PrototypeClass.class));

            
        }

    }
}
