package javaJungsuk.OOP;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Television());
        System.out.println();
        b.buy(new Computer());
    }
}

class Product {
    int price;
    int bonuspoint;

    Product (int price) {
        this.price = price;
        bonuspoint = (int)(price/10.0);
    }
}

class Television extends Product {
    Television() {
        //Product(int price) 호출
        super(100);
    }
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() {
        //Product(int price)
        super(200);
    }
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonuspoint;
        System.out.println(p + "을/를 구입하셨습니다.");

        System.out.println("현재 남은 돈은 " + money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + bonusPoint + "점입니다.");
    }

}