package pl.cezarysanecki.springdemotests.singletonprototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingletonPrototypeConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    SingletonClass singletonClass() {
        return new SingletonClass() {
            @Override
            protected PrototypeClass createPrototypeClass() {
                return prototypeClass();
            }
        };
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    PrototypeClass prototypeClass() {
        return new PrototypeClass();
    }

}
