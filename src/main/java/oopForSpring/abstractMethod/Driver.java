package oopForSpring.abstractMethod;

public class Driver {

    public static void main(String[] args) {
        //객체배열 생성
        Animal[] animals = new Animal[4];

        animals[0] = new Mouse();
        animals[1] = new Cat();
        animals[2] = new Calf();
        animals[3] = new Chick();

        for(int idx = 0; idx < animals.length; idx++)
            animals[idx].cry();
    }



}