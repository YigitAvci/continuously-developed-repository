package com.hunter.continuouslydevelopedproject.configurationAnnotation;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("bean has just been created! hashcode: " + this.hashCode());
    }
}
