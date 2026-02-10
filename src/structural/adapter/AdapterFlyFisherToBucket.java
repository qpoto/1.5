package structural.adapter;

public class AdapterFlyFisherToBucket extends FlyFisher implements AnglerFishBucket {
    @Override
    public void putFish() {
        putFishInBucket();
    }

    @Override
    public void releaseFish() {
        releaseFishFromBucket();
    }

    @Override
    public void getFishByType() {
        getFishByTypeFromBucket();
    }

    @Override
    public void countFish() {
        getFishCountInBucket();
    }
}
