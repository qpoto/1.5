package creational.abstractfactory;

import creational.abstractfactory.flyfishingkit.FFKit;

import java.util.SortedMap;

public class Fishing {
    public static void main(String[] args) {
        FishingKit fk = new FFKit();
        Bait bait = fk.getBait();
        Clothing clothing = fk.getClothing();
        Rod rod = fk.getRod();

        System.out.println("Жена отпустила меня на рыбалку - УРА!");
        bait.getBait();
        clothing.getClothing();
        rod.getRod();
        System.out.println("Мчу на встречу с рекой!");
    }
}
