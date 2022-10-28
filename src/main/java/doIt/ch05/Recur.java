package doIt.ch05;

import java.util.Scanner;

public class Recur {
    static void recur(int n) {
        if (n > 0) {
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        recur(num);
    }
}
