package structural.bridge;

public class FlyFisher implements Fisher {

    @Override
    public void catchFish() {
        System.out.println("Нахлыстовик поймал рыбу");
    }
}
