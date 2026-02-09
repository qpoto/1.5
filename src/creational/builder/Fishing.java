package creational.builder;

public class Fishing {
    public static void main(String[] args) {
        FlyFisher flyFisher = new FlyFisher();
        flyFisher.setRodBuilder(new FlyRodBuilder());
        Rod rod = flyFisher.buildRod();
        System.out.println(rod);
    }
}
