package javaJungsuk.OOP;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        int x = 0;

        p.setX(x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    private int x = 100;

    public int getX() {return x;}
    public void setX(int x) {
        System.out.println("p.x = " + this.x);
    }
    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.getX());
        System.out.println("this.x = " + this.x);
    }
}