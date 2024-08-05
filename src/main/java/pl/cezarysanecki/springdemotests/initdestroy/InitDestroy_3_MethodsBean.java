package pl.cezarysanecki.springdemotests.initdestroy;

public class InitDestroy_3_MethodsBean {

    public void init() {
        System.out.println("initializing using methods...");
    }

    public void destroy() {
        System.out.println("destroying using methods...");
    }

}
