package pl.cezarysanecki.springdemotests.aliasfor;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@BaseAnnotation(
        value = "abc"
)
public @interface AdditionalAnnotation {

    @AliasFor(annotation = BaseAnnotation.class, attribute = "differentValue")
    String overriddenAnnotation() default "anotherDefault";

}
