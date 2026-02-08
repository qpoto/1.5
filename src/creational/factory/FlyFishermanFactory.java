package creational.factory;

public class FlyFishermanFactory implements FishermanFactory {

    @Override
    public Fisherman createFisherman() {
        return new FlyFisherman();
    }
}
