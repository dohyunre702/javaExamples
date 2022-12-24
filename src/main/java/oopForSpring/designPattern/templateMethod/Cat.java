package oopForSpring.designPattern.templateMethod;

public class Cat extends Animal {

    @Override
    void play() { //추상 메서드 오버라이딩
        System.out.println("야옹~ 야옹~");
    }

    @Override
    void runSomething() { //hook 메서드 오버라이딩
        // super.runSomething(); animal의 기본 메서드 호출
        System.out.println("야옹 야옹! 꼬리 살랑살랑~");
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
