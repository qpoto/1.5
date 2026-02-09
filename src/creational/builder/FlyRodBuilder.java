package creational.builder;

public class FlyRodBuilder extends RodBuilder {

    @Override
    void buildLineWeight() {
        rod.setLineWeight(3);
    }

    @Override
    void buildLength() {
        rod.setLength(10);
    }

    @Override
    void buildType() {
        rod.setType(Type.FRESHWATER);
    }
}
