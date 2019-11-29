package com.imooc.diveinspringboot.Condition;


import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemCondition.class)
public @interface OnSystemPropertyCondition {

    String name();

    String value();
}
