package creational.prototype;

public class WetFly implements Copyable{
    private int invented;
    private String name;
    private String flyPattern;


    public WetFly(int invented, String name, String flyPattern) {
        this.invented = invented;
        this.name = name;
        this.flyPattern = flyPattern;
    }


    public int getInvented() {
        return invented;
    }

    public void setInvented(int invented) {
        this.invented = invented;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlyPattern() {
        return flyPattern;
    }

    public void setFlyPattern(String flyPattern) {
        this.flyPattern = flyPattern;
    }

    @Override
    public Object copy() {
        return new WetFly(invented, name, flyPattern);
    }

    @Override
    public String toString() {
        return "WetFly{" +
                "invented=" + invented +
                ", name='" + name + '\'' +
                ", flyPattern='" + flyPattern + '\'' +
                '}';
    }
}
