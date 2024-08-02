package pl.cezarysanecki.springdemotests.injectingdependencies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ConfigurationClass {

    @Bean
    public AggregationClassForConfiguration aggregationClassForConfiguration() {
        return new AggregationClassForConfiguration(baseClassForConfiguration());
    }

    @Bean
    public BaseClassForConfiguration baseClassForConfiguration() {
        return new BaseClassForConfiguration();
    }

}
