package com.in28minutes.learn_spring_framework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

////// ??????????
record Person (String name , int age , Address address){};
record Address (String city, String planet){};

@Configuration
public class HelloWorldConfiguration {
    




    @Bean
    public String name(){
        return "King_Shadow :)";
    }

    @Bean
    public int age(){
        return 27;
    }

    @Bean
    public Person person(){
        return new Person("ricardo", 69 , address_3());
    }

    @Bean
    public Person person2(String name,int age ,@Qualifier("address3Qualifier") Address address){
        return new Person("milos", 666 , address);
    }

    @Bean(name = "address1")
    public Address address_1(){
        return new Address("leaf village", "sun");
    }

    @Bean(name = "address2")
    public Address address_2(){
        return new Address("sound village", "moon");
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address_3(){
        return new Address("flexair", "star");
    }

    @Bean
    public Person person2MethodCall(){
        return new Person("shibai",9999,new Address("otsutsuki","beyond"));
    }

}
