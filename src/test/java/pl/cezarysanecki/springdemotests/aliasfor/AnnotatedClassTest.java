package pl.cezarysanecki.springdemotests.aliasfor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;

@SpringBootTest
class AnnotatedClassTest {

    @Autowired
    AnnotatedClass annotatedClass;

    @Test
    void checkAliasForAnnotation() {
        BaseAnnotation baseAnnotation = AnnotationUtils.getAnnotation(annotatedClass.getClass(), BaseAnnotation.class);
        AdditionalAnnotation additionalAnnotation = AnnotationUtils.getAnnotation(annotatedClass.getClass(), AdditionalAnnotation.class);

        BaseAnnotation mergedAnnotation = AnnotatedElementUtils.getMergedAnnotation(annotatedClass.getClass(), BaseAnnotation.class);

        System.out.println("=== AdditionalAnnotation ===");
        System.out.println(additionalAnnotation.overriddenAnnotation());
        System.out.println("=== BaseAnnotation ===");
        System.out.println(baseAnnotation.value());
        System.out.println(baseAnnotation.anotherValue());
        System.out.println(baseAnnotation.differentValue());

        System.out.println("=== BaseAnnotation with merge ===");
        System.out.println(mergedAnnotation.value());
        System.out.println(mergedAnnotation.anotherValue());
        System.out.println(mergedAnnotation.differentValue());
    }

}