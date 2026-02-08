package creational.factory;

public class Fishing {
    public static void main(String[] args) {
        FishermanFactory factory = createFishermanFactory("ff");
        Fisherman fisherman = factory.createFisherman();
        fisherman.catchFish();
    }

    static FishermanFactory createFishermanFactory(String method) {
        return switch (method) {
            case "sp" -> new SpinningAnglerFactory();
            case "ff" -> new FlyFishermanFactory();
            default -> throw new IllegalArgumentException("Данный вид ловили не допустим: " + method);
        };
    }
}
