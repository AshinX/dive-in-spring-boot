package com.imooc.diveinspringboot.BootStrap;

import com.imooc.diveinspringboot.Condition.OnSystemPropertyCondition;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;



public class OnSystemConditionBootStrap {

    @Bean
    @OnSystemPropertyCondition(name = "user.name",value = "13391")
    public String helloWorld(){
        return "我喜欢你，但是我知道我不配，所以我只想简单的每天陪着你";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(OnSystemConditionBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);

        context.close();
    }
}
