package com.gyx.demo.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = (DemoMethodService)context.getBean("demoMethodService");
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
