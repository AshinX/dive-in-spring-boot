package com.imooc.diveinspringboot.Condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


public class OnSystemCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(OnSystemPropertyCondition.class.getName());

        String name = String.valueOf(annotationAttributes.get("name"));
        String value = String.valueOf(annotationAttributes.get("value"));
        String property = System.getProperty(name);
        return value.equals(property);
    }
}
