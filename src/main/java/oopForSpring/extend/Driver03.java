package oopForSpring.extend;

public class Driver03 {
    public static void main(String[] args) {
        //객체배열 생성
        Animal[] animals = new Animal[7];

        animals[0] = new Animal();
        animals[1] = new Mammals();
        animals[2] = new Birds();
        animals[3] = new Whale();
        animals[4] = new Vat();
        animals[5] = new Sparrow();
        animals[6] = new Penguin();

        for(int idx = 0; idx < animals.length; idx++) animals[idx].showMe();

    }
}
