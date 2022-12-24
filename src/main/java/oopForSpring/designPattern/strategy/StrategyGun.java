package oopForSpring.designPattern.strategy;

//전략 인터페이스를 구현
public class StrategyGun implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("탕, 타당, 타다당!");
    }
}
