package javaJungsuk.OOP;

//tv class
class Tv{
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

public class TvTest {
    public static void main(String args[])
    {
        Tv t1 = new Tv(); //instance
        Tv t2 = new Tv();
        System.out.println("현재 채널은 " + t1.channel + " 입니다.");
        System.out.println("현재 채널은 " + t2.channel + " 입니다.");

        t1.channel = 7;
        t2.channelUp();
        System.out.println("현재 채널은 " + t1.channel + " 입니다.");
        System.out.println("현재 채널은 " + t2.channel + " 입니다.");

        t2 = t1;
        System.out.println("현재 채널은 " + t1.channel + " 입니다.");
        System.out.println("현재 채널은 " + t2.channel + " 입니다.");

        //객체배열
        Tv tv1, tv2, tv3; //Tv객체 tv1, tv2, tv3 생성
        Tv[] tvArr = new Tv[3]; //객체배열(참조변수 배열) 생성
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();

        //for
        Tv[] tvArr2 = new Tv[100];
        for (int i = 0; i < tvArr.length; i++)
        {
            tvArr[i] = new Tv();
        }
    }
}
