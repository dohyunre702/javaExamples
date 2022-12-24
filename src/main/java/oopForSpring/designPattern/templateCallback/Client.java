package oopForSpring.designPattern.templateCallback;


//템플릿 콜백 패턴 클라이언트
public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        //총을 람보에게 전달해 전투를 수행하게 한다
        rambo.runContext("총! 총! 총!");
        System.out.println();

        //총을 람보에게 전달해 전투를 수행하게 한다
        rambo.runContext("칼! 칼! 칼!");
        System.out.println();

        //총을 람보에게 전달해 전투를 수행하게 한다
        rambo.runContext("활! 활! 활!");
    }
}
