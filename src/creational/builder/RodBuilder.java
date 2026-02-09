package creational.builder;

public abstract class RodBuilder {
    Rod rod;

    void createRod() {
        rod = new Rod();
    }

    abstract void buildLineWeight();
    abstract void buildLength();
    abstract void buildType();

    Rod getRod() {
        return rod;
    }
}
