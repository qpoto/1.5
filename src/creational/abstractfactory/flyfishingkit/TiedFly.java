package creational.abstractfactory.flyfishingkit;

import creational.abstractfactory.Bait;

public class TiedFly implements Bait {
    @Override
    public void getBait() {
        System.out.println("Взял мухи");
    }
}
