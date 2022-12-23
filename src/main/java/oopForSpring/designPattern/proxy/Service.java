package oopForSpring.designPattern.proxy;

//IService 인터페이스 구현한 Serivce
public class Service implements IService {

    @Override
    public String runSomething() {
        return "서비스 짱!!";
    }
}
