package oopForSpring.extend;

public class Driver02 {
    public static void main(String[] args) {
        //하위 클래스는 상위 클래스다.
        //하위 클래스 is a kind of 상위 클래스
        Animal animal = new Animal();
        Animal mammals = new Mammals();
        Animal birds = new Birds();
        Animal whale = new Whale();
        Animal vat = new Vat();
        Animal sparrow = new Sparrow();
        Animal penguin = new Penguin();

        animal.showMe();
        mammals.showMe();
        birds.showMe();
        whale.showMe();
        vat.showMe();
        sparrow.showMe();
        penguin.showMe();
    }
}
