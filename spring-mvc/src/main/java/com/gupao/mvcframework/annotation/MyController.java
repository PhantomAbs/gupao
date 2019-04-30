package com.gupao.mvcframework.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author Spencer Zhang
 * @ClassName MyController
 * {@link org.springframework.stereotype.Controller}
 * @Date 2019/04/10
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyController {
    @AliasFor(
            annotation = Component.class
    )
    String value() default "";
}
