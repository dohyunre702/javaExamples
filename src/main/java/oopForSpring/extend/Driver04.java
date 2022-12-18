package oopForSpring.extend;

public class Driver04 {
    public static void main(String[] args) {
        Flyable fly1 = new Vat();
        fly1.fly();

        Flyable fly2 = new Sparrow();
        fly2.fly();

        //객체배열
        Swimable[] bottles = new Swimable[2];
        bottles[0] = new Whale();
        bottles[1] = new Penguin();

        for(Swimable bottle : bottles) bottle.swim();
    }
}
