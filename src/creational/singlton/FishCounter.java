package creational.singlton;

public class FishCounter {
    private static FishCounter fc;
    private static int count;

    public static FishCounter getCounter() {
        if (fc == null) {
            fc = new FishCounter();
        }
        return fc;
    }

    private FishCounter() {}

    public void incrementCount() {
        System.out.println("Поймал рыбку");
        count++;
    }

    public int getCount() {
        return count;
    }
}
