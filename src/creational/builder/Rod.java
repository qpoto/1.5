package creational.builder;

public class Rod {
    private int lineWeight;
    private int length;
    private Type type;

    public void setLineWeight(int lineWeight) {
        this.lineWeight = lineWeight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Rod{" +
                "lineWeight='" + lineWeight + '\'' +
                ", length='" + length + '\'' +
                ", type=" + type +
                '}';
    }
}
