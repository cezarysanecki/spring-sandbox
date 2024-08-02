package pl.cezarysanecki.springdemotests.injectingdependencies;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentClassTest {

    @Autowired
    BaseClassForComponent baseClassForComponent;

    @Autowired
    AggregationClassForComponent aggregationClassForComponent;

    @Test
    void checkCreationOfBeans() {
        System.out.println("just bean - " + baseClassForComponent);
        System.out.println("aggregated bean - " + aggregationClassForComponent.baseClassForComponent);
    }

}