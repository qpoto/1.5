package creational.prototype;

public class WetFlyFactory {
    WetFly wetFly;

    public WetFlyFactory(WetFly wetFly) {
        this.wetFly = wetFly;
    }

    public void setWetFly(WetFly wetFly) {
        this.wetFly = wetFly;
    }

    WetFly cloneWetFly() {
        return (WetFly) wetFly.copy();
    }
}
