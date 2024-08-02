package pl.cezarysanecki.springdemotests.injectingdependencies;

public class AggregationClassForComponent {

    public final BaseClassForComponent baseClassForComponent;

    public AggregationClassForComponent(BaseClassForComponent baseClassForComponent) {
        this.baseClassForComponent = baseClassForComponent;
    }
}
