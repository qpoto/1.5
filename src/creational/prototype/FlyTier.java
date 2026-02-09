package creational.prototype;

public class FlyTier {
    public static void main(String[] args) {
        WetFly woollyBugger = new WetFly(1950, "Woolly Bugger", "Don Harger");
        System.out.println(woollyBugger);

        WetFlyFactory factory = new WetFlyFactory(woollyBugger);
        WetFly wbCoby = factory.wetFly;
        System.out.println(wbCoby);
    }
}
