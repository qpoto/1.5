package creational.abstractfactory.flyfishingkit;

import creational.abstractfactory.Bait;
import creational.abstractfactory.Clothing;
import creational.abstractfactory.FishingKit;
import creational.abstractfactory.Rod;

public class FFKit implements FishingKit {
    @Override
    public Rod getRod() {
        return new FlyRod();
    }

    @Override
    public Bait getBait() {
        return new TiedFly();
    }

    @Override
    public Clothing getClothing() {
        return new Waders();
    }
}
