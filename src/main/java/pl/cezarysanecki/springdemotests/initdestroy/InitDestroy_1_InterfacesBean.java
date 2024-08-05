package pl.cezarysanecki.springdemotests.initdestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDestroy_1_InterfacesBean implements DisposableBean, InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("initializing using interfaces...");
    }

    @Override
    public void destroy() {
        System.out.println("destroying using interfaces...");
    }

}
