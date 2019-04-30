package com.gupao.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @author Spencer Zhang
 * @ClassName MyAutowired
 * {@link org.springframework.beans.factory.annotation.Autowired}
 * @Date 2019/04/10
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {
    boolean required() default true;
}
