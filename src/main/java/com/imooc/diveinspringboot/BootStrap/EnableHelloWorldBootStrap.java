package com.imooc.diveinspringboot.BootStrap;

import com.imooc.diveinspringboot.Annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class EnableHelloWorldBootStrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
            String hello = context.getBean("hello", String.class);
            System.out.println("hello:"+hello);

            context.close();
    }
}
