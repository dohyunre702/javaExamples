package javaJungsuk.OOP;

public class ReferenceParamEx {
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x); //d.x의 값 10 출력

        changeReference(d);
        System.out.println("after change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void changeReference (Data d) {
        d.x = 1000;
        System.out.println("change() : x =" + d.x);
    }
}
