package structural.adapter;

public class Fishing {
    public static void main(String[] args) {
        AnglerFishBucket fs = new AdapterFlyFisherToBucket();

        fs.putFish();
        fs.getFishByType();
        fs.countFish();
        fs.releaseFish();
    }
}
