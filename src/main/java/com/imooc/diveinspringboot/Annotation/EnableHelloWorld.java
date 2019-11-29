package com.imooc.diveinspringboot.Annotation;


import com.imooc.diveinspringboot.Responsity.HelloWorldConfiguration;
import com.imooc.diveinspringboot.Responsity.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
