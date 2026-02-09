package creational.builder;

public class FlyFisher {
    RodBuilder rodBuilder;

    public void setRodBuilder(RodBuilder rodBuilder) {
        this.rodBuilder = rodBuilder;
    }

    Rod buildRod() {
        rodBuilder.createRod();
        rodBuilder.buildLineWeight();
        rodBuilder.buildLength();
        rodBuilder.buildType();
        return rodBuilder.getRod();
    }
}
