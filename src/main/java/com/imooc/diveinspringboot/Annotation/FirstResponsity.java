package com.imooc.diveinspringboot.Annotation;


import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
public @interface FirstResponsity {

    String value() default "";
}
