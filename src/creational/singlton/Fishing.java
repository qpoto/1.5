package creational.singlton;

public class Fishing {
    public static void main(String[] args) {
        FishCounter fc = FishCounter.getCounter();
        System.out.println("Надеюсь клев сегодня будет...");
        fc.incrementCount();
        fc.incrementCount();
        fc.incrementCount();
        fc.incrementCount();
        System.out.println("Пошла жара! Одна за одной! Прошло меньше секунды, а уже поймал: " + fc.getCount() + "шт.");
    }
}
