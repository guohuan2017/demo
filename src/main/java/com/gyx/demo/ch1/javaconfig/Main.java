package com.gyx.demo.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = annotationConfigApplicationContext.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("java config"));

        annotationConfigApplicationContext.close();
    }
}
