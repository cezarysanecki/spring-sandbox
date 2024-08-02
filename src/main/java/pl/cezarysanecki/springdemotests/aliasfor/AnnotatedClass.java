package pl.cezarysanecki.springdemotests.aliasfor;

import org.springframework.stereotype.Component;

@Component
@AdditionalAnnotation(
        overriddenAnnotation = "overridden"
)
public class AnnotatedClass {
}
