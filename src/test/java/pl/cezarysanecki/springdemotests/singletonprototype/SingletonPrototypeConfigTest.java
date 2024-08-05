package pl.cezarysanecki.springdemotests.singletonprototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        classes = SingletonPrototypeConfig.class
)
class SingletonPrototypeConfigTest {

    @Autowired
    SingletonClass singletonClass;

    @Test
    void testingProxyForSingletonPrototype() {
        singletonClass.callPrototype();
        singletonClass.callPrototype();
        singletonClass.callPrototype();
    }

}