package com.imooc.diveinspringboot.BootStrap;


import com.imooc.diveinspringboot.Service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.imooc.diveinspringboot.Service")
public class CalculateServiceBootStrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootStrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        CalculateService bean = context.getBean(CalculateService.class);
        Integer sum = bean.sum(1, 12, 123, 123, 123, 1, 23, 123, 123, 123);
        System.out.println(sum);

    }
}
