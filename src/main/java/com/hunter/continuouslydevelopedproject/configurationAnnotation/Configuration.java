package com.hunter.continuouslydevelopedproject.configurationAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Autowired
    MyBean myBean;

    @Bean
    public MyBean beanCreation() {
        return new MyBean();
    }

    @Bean
    public BeanConsumer beanConsumerCreation() {
        return new BeanConsumer(myBean);
    }
}
