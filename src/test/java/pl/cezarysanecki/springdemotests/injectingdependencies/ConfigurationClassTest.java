package pl.cezarysanecki.springdemotests.injectingdependencies;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigurationClassTest {

    @Autowired
    BaseClassForConfiguration baseClassForConfiguration;

    @Autowired
    AggregationClassForConfiguration aggregationClassForConfiguration;

    @Test
    void checkCreationOfBeans() {
        System.out.println("just bean - " + baseClassForConfiguration);
        System.out.println("aggregated bean - " + aggregationClassForConfiguration.baseClassForConfiguration);
    }

}