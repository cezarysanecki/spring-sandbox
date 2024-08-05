package pl.cezarysanecki.springdemotests.singletonprototype;

public abstract class SingletonClass {

    public void callPrototype() {
        System.out.println("calling prototype: " + createPrototypeClass().call());
    }

    protected abstract PrototypeClass createPrototypeClass();

}
