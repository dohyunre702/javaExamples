package oopForSpring.thisAndSuper;

//this 예제
class Penguin {
    int var = 10;

    void test() {
        int var = 20;

        System.out.println(var); //지역 변수에 저장된 var = 20;
        System.out.println(this.var); //객체 변수에 저장된 var = 10;
    }
}

public class DriverThis {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();
        pororo.test();
    }
}
