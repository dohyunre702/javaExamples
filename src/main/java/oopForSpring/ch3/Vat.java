package oopForSpring.ch3;

public class Vat extends Mammals implements Flyable {

    Vat() {
        myClass = "박쥐";
    }

    @Override
    public void fly() {
        System.out.println("날고 있음. 슈웅 슈웅");
    }
}
