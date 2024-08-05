package pl.cezarysanecki.springdemotests.initdestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class InitDestroy_2_AnnotationsBean {

    @PostConstruct
    public void init() {
        System.out.println("initializing using annotations...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroying using annotations...");
    }

}
