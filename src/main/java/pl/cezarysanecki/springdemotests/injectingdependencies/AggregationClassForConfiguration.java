package pl.cezarysanecki.springdemotests.injectingdependencies;

public class AggregationClassForConfiguration {

    public final BaseClassForConfiguration baseClassForConfiguration;

    public AggregationClassForConfiguration(BaseClassForConfiguration baseClassForConfiguration) {
        this.baseClassForConfiguration = baseClassForConfiguration;
    }
}
