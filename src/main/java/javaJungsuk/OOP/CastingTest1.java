package javaJungsuk.OOP;

public class CastingTest1 {
    public static void main(String[] args) {
        ModelCar modelcar = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        modelcar = fe;
        // modelcar.water; //(업)자손타입의 참조변수가 조상타입의 참조변수로 형변환됨 > 자손타입의 멤버를 사용할 수 없다.

        fe2 = (FireEngine) modelcar;
        fe2.water(); //(다운)조상타입의 참조변수가 자손타입의 참조변수로 형변환됨 > 자손 타입의 멤버를 사용할 수 있다.
    }
}

class ModelCar {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine extends ModelCar {
    void water() {
        System.out.println("water!!");
    }
}