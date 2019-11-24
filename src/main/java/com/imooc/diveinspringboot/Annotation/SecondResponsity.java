package com.imooc.diveinspringboot.Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstResponsity
public @interface SecondResponsity {
    String value() default "";
}
