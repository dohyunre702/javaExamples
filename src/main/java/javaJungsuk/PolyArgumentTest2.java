package javaJungsuk;

public class PolyArgumentTest2 {
    class Product {
        int price;
        int bonusPoint;

        public Product(int price) {
            this.price = price;
            bonusPoint = (int) (price/10.0);
        }

        public Product() { //기본 생성자
        }
    }

    class Tv extends Product {
        Tv() {super(100);} //조상 클래스의 생성자 호출
        public String toString() {return "Tv";}
    }

    class Computer extends Product {
        Computer() {super(200);}
        public String toString() {return "Computer";}
    }

    class Audio extends Product {
        Audio() {super(50);}
        public String toString() {return "Audio";}
    }

    class Buyer {
        int money = 1000;
        int bonusPoint = 0;
        Product[] item = new Product[10];
        int i = 0;

        void buy(Product p) {
            if(money < p.price) {
                System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
                return;
            }
            money -= p.price;
            bonusPoint += bonusPoint;
            item[i++] = p;
            System.out.println(p + "을/를 구입하셨습니다.");
        }

        void summary() {
            int sum = 0;
            String itemList = "";
            for (int i = 0; i<item.length;i++) {
                if(item[i] == null) break;
                sum += item[i].price;
                itemList += item[i] + ", ";
            }
            System.out.println("구입한 물품의 총금액:" + sum);
            System.out.println("구입한 제품" + itemList);
        }



    }

}
