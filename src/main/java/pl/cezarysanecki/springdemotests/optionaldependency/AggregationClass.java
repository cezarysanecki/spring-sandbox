package pl.cezarysanecki.springdemotests.optionaldependency;

public class AggregationClass {

    public final BaseInterface baseInterface;

    public AggregationClass(BaseInterface baseInterface) {
        this.baseInterface = baseInterface;
    }

}
