package pl.cezarysanecki.springdemotests.initdestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDestroyConfig {

    @Bean
    InitDestroy_1_InterfacesBean initDestroy1InterfacesBean() {
        return new InitDestroy_1_InterfacesBean();
    }

    @Bean
    InitDestroy_2_AnnotationsBean initDestroy2AnnotationsBean() {
        return new InitDestroy_2_AnnotationsBean();
    }

    @Bean(
            initMethod = "init",
            destroyMethod = "destroy"
    )
    InitDestroy_3_MethodsBean initDestroy3MethodsBean() {
        return new InitDestroy_3_MethodsBean();
    }

}
