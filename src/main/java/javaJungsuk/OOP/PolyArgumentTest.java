package javaJungsuk.OOP;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Television());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}

class Product {
    int price;
    int bonusPoint;

    Product (int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
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

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {return "Audio";}
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10]; //구입한 제품을 저장하는 참조변수 배열
    int i = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p; //제품을 Product[] item에 저장
        System.out.println(p + "을/를 구입하셨습니다.");

        System.out.println("현재 남은 돈은 " + money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + bonusPoint + "점입니다.");
        System.out.println();
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i = 0 ; i < item.length; i++) {
            if(item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

}