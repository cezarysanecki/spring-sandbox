package pl.cezarysanecki.springdemotests.specificbeantype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class SpecificTypeConfiguration {

    @Bean
    public FirstClass firstClass(A a) {
        return new FirstClass(a);
    }

    @Bean
    public SecondClass secondClass(B b) {
        return new SecondClass(b);
    }

    @Bean
    public ExampleClass exampleClass() {
        return new ExampleClass();
    }

}
