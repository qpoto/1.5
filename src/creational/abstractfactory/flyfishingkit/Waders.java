package creational.abstractfactory.flyfishingkit;

import creational.abstractfactory.Clothing;

public class Waders implements Clothing {
    @Override
    public void getClothing() {
        System.out.println("Одел вейдерсы");
    }
}
