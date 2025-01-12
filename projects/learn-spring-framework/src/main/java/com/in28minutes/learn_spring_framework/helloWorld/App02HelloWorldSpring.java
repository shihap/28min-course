package com.in28minutes.learn_spring_framework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println("#name -> " + context.getBean("name"));
        System.out.println("#age -> " + context.getBean("age"));
        System.out.println("#person -> " + context.getBean("person"));
        System.out.println("#address_1 -> " + context.getBean("address1"));
        System.out.println("#address_2 -> " + context.getBean("address2"));
        System.out.println("#person2MethodCall -> " + context.getBean("person2MethodCall"));
        System.out.println("#person 2 -> " + context.getBean("person2"));
    }
}
