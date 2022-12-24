package oopForSpring.designPattern.strategy;

//전략을 사용하는 컨텍스트
public class Soldier {
    void runContext(Strategy strategy) {
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}
