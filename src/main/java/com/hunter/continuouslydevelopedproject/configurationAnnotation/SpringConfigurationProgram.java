package com.hunter.continuouslydevelopedproject.configurationAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigurationProgram {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        context.getBean(MyBean.class);
        context.getBean(MyBean.class); //it won't create a new instance of MyBean class

        context.getBean(BeanConsumer.class); //this BeanConsumer instance will consume the instance of MyBean class

    }
}
