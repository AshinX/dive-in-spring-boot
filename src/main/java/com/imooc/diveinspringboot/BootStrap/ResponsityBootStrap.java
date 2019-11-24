package com.imooc.diveinspringboot.BootStrap;

import com.imooc.diveinspringboot.Responsity.FirstConfigurationResponsity;
import com.imooc.diveinspringboot.Responsity.SecondConfigurationResponsity;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.imooc.diveinspringboot")
public class ResponsityBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ResponsityBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        FirstConfigurationResponsity firstConfigurationResponsity = context.getBean("firstConfigurationResponsity", FirstConfigurationResponsity.class);
        SecondConfigurationResponsity secondConfigurationResponsity = context.getBean("secondConfigurationResponsity", SecondConfigurationResponsity.class);
        System.out.println("firstConfigurationResponsity:"+firstConfigurationResponsity.toString());
        System.out.println("secondConfigurationResponsity:"+secondConfigurationResponsity.toString());
        context.close();
    }
}
