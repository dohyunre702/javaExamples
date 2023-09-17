package javaJungsuk.OOP;

class Car {
    String color; //색상
    String gearType; //변속기 종류(auto/manual)
    int door; //문의 개수

    //constructor overloading
    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) { //생성자(parameterized constructor)
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    //copy constructor
    Car(Car carCopy)
    {
        this.color = carCopy.color;
        this.gearType = carCopy.gearType;
        this.door = carCopy.door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car("red", "auto", 2);
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door=" + c2.door);
        System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door=" + c3.door);

        //copy constructor
        Car c4 = new Car(c2);
        System.out.println("* Copy constructor used second object");
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door=" + c2.door);
    }
}
