package creational.factory;

public class SpinningAnglerFactory implements FishermanFactory{
    @Override
    public Fisherman createFisherman() {
        return new SpinningAngler();
    }
}
