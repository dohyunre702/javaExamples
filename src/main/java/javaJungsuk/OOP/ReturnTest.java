package javaJungsuk.OOP;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5); //int add() 끌어오기
        System.out.println(result);

        int[] result2 = {0};
        r.add(3,5,result2); //void add() 끌어오기
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) { //반환값이 있는 메서드를
        result[0] = a + b; //참조형 매개변수를 활용해 반환값이 없는 메서드로 변환
    }
}
