package doIt.ch05;

//재귀 알고리즘의 비재귀적 표현 1. 꼬리재귀 제거
public class RecurX1 {
    static void recur (int x) {
        while (x > 0) {
            recur(x-1);
            System.out.println(x);
            x = x-2;
        }
    }
}
