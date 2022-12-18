package oopForSpring.extend;

public class Penguin extends Birds implements Swimable{

    Penguin() {
        myClass = "펭귄";
    }

    @Override
    public void swim() {
        System.out.println("수영 중. 어푸어푸!");
    }
}
