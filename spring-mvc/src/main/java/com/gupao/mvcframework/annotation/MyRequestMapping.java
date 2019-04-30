package com.gupao.mvcframework.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * @author Spencer Zhang
 * @ClassName MyRequestMapping
 * {@link org.springframework.web.bind.annotation.RequestMapping}
 * @Date 2019/04/10
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface MyRequestMapping {
    String name() default "";

    @AliasFor("path")
    String[] value() default {};

    @AliasFor("value")
    String[] path() default {};

    RequestMethod[] method() default {};

    String[] params() default {};

    String[] headers() default {};

    String[] consumes() default {};

    String[] produces() default {};
}
