package com.example.IntroToSpringBoot;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {

    void eatApple(){
        System.out.println("I am eating apple");
    }

    @PostConstruct
    void createdBeforeApple(){
        System.out.println("Before eating apple");
    }

    @PreDestroy
    void createdAfterApple(){
        System.out.println("After eating apple");
    }
}
