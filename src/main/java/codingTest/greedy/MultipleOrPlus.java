package codingTest.greedy;

import java.util.Scanner;

//곱하기 혹은 더하기
public class MultipleOrPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //Q. 왜 String > char > int 배열에 저장하면 끝에 0이 추가되나?

        //1번째 문자
        long result = s.charAt(0) - '0';

        //두 수 중 하나라도 0 or 1이면 더하기 수행
        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num <= 1 || result <= 1) {
                result += num;
            }
            else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}
