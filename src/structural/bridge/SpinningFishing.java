package structural.bridge;

public class SpinningFishing extends Fishing {
    public SpinningFishing(Fisher fisher) {
        super(fisher);
    }

    @Override
    public void catchfish() {
        System.out.println("Началась рыбалка на спиннинг");
        fisher.catchFish();
    }
}
