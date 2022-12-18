package oopForSpring.extend;

public class Sparrow extends Birds implements Flyable{

    Sparrow() {
        myClass = "참새";
    }

    @Override
    public void fly() {
        System.out.println("날고 있음. 슈웅 슈웅");
    }
}
