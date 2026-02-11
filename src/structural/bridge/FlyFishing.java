package structural.bridge;

public class FlyFishing extends Fishing {
    public FlyFishing(Fisher fisher) {
        super(fisher);
    }

    @Override
    public void catchfish() {
        System.out.println("Началась рыбалка на нахлыст");
        fisher.catchFish();
    }
}
