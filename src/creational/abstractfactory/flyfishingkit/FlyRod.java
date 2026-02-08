package creational.abstractfactory.flyfishingkit;

import creational.abstractfactory.Rod;

public class FlyRod implements Rod {
    @Override
    public void getRod() {
        System.out.println("Взял палку для нахлыста");
    }
}
