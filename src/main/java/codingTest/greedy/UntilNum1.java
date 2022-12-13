package codingTest.greedy;

import java.util.Scanner;

//1이 될 때까지
public class UntilNum1 {
    public static void solution(int n, int k) {
        int result = 0;
        while (true) {
            //n이 k로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            //n이 k보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            //k로 나누기
            result += 1;
            n /= k;
        }

        //마지막으로 남은 수에 대하여 1씩 빼기
        result += (n-1);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //n
        int b = sc.nextInt(); //k
        solution(a,b);
    }
}
