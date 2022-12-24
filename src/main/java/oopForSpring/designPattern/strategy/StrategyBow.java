package oopForSpring.designPattern.strategy;

//전략 인터페이스를 구현
public class StrategyBow implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("슝, 쐐액.. 쐑");
    }
}
