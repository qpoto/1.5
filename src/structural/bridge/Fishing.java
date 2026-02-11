package structural.bridge;

public abstract class Fishing {
    protected Fisher fisher;
    public Fishing(Fisher fisher) {
        this.fisher = fisher;
    }
    public abstract void catchfish();
}
