package oopForSpring.ch3;

public class Driver01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammals mammals = new Mammals();
        Birds birds = new Birds();
        Whale whale = new Whale();
        Vat vat = new Vat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        //상위 클래스(Animals)에서만 showMe()를 구현했지만 모든 클래스에서 메소드 사용 가능 = 상속(extends)
        animal.showMe();
        mammals.showMe();
        birds.showMe();
        whale.showMe();
        vat.showMe();
        sparrow.showMe();
        penguin.showMe();
    }
}
