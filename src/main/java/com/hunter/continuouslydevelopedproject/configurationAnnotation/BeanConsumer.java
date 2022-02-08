package com.hunter.continuouslydevelopedproject.configurationAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanConsumer {

    MyBean bean;

    @Autowired
    public BeanConsumer(MyBean myBean) {
        this.bean = myBean;

        System.out.println("*********");
        System.out.println("My hashcode: " + this.hashCode());
        System.out.println("the object's hashcode that I use: " + this.bean.hashCode());
    }

}
