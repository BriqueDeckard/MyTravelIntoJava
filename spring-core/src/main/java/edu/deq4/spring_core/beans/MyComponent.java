package edu.deq4.spring_core.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    @PostConstruct
    public void init(){
        System.out.println("Bean initialisé");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean détruit");
    }

    public void doSomething(){
        System.out.println("do something");
    }
}
