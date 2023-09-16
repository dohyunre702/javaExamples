package javaJungsuk.OOP;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x); //d.x의 값 10 출력

        changePrime(d.x);
        System.out.println("after change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void changePrime(int x) {
        x = 1000;
        System.out.println("change() : x =" + x);
    }

}
