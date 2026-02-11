package structural.bridge;

public class FishingEvent {

    public static void main(String[] args) {
        Fishing[] fishings = {
                new FlyFishing(new FlyFisher()),
                new SpinningFishing(new SpinningAngler())
        };
        for(Fishing fishing : fishings) {
            fishing.catchfish();
        }
    }

}
