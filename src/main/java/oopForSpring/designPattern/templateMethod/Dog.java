package oopForSpring.designPattern.templateMethod;

public class Dog extends Animal {

    @Override
    void play() { //추상 메서드 오버라이딩
        System.out.println("멍! 멍!");
    }

    @Override
    void runSomething() { //Hook(갈고리) 메서드 오버라이딩
        System.out.println("멍! 멍! 꼬리 살랑살랑~");
    }

    /*
    public void playWithOwner() {
        System.out.println("귀염둥이 이리 온");
        System.out.println("멍! 멍!");
        System.out.println("꼬리 살랑살랑");
        System.out.println("잘했어~");
    }

     */
}
