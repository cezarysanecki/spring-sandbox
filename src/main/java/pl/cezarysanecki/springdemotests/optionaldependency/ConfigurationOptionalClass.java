package pl.cezarysanecki.springdemotests.optionaldependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class ConfigurationOptionalClass {

    @Bean
    public AggregationClass aggregationClass(Optional<BaseInterface> baseInterface) {
        return new AggregationClass(baseInterface.orElseGet(BaseDefaultClass::new));
    }

    @Bean
    public BaseSpecifiedClass baseSpecifiedClass() {
        return new BaseSpecifiedClass();
    }

}
