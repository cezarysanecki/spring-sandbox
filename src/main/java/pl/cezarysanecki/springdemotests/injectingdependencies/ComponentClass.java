package pl.cezarysanecki.springdemotests.injectingdependencies;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComponentClass {

    @Bean
    public AggregationClassForComponent aggregationClassForComponent() {
        return new AggregationClassForComponent(baseClassForComponent());
    }

    @Bean
    public BaseClassForComponent baseClassForComponent() {
        return new BaseClassForComponent();
    }

}
