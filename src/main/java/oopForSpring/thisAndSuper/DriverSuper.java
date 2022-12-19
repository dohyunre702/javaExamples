package oopForSpring.thisAndSuper;

class Animal {
    void method() {
        System.out.println("동물");
    }
}

class Birds extends Animal {
    void method() {
        super.method();
        System.out.println("조류");
    }
}

class Kiwii extends Birds {
    void method() {
        super.method();
        System.out.println("키위새");

        //syntax error 접근 불가
        //super.super.method();
    }
}

public class DriverSuper {
    public static void main(String[] args) {
        Kiwii mini = new Kiwii();
        mini.method(); //각각 상위 클래스의 메서드를 호출하고 있으므로, 결과: 동물 조류 키위새 모두 출력
    }
}
