package oopForSpring.extend;

public class Whale extends Mammals implements Swimable {

    Whale() {
        myClass = "고래";
    }

    @Override
    public void swim() {
        System.out.println("수영 중. 어푸어푸!");
    }
}
