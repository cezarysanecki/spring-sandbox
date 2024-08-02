package pl.cezarysanecki.springdemotests.aliasfor;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface BaseAnnotation {

    @AliasFor(attribute = "anotherValue")
    String value() default "";

    @AliasFor(attribute = "value")
    String anotherValue() default "";

    String differentValue() default "default";

}
