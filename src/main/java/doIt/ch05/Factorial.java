package doIt.ch05;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n > 0)
            return n  * factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        factorial(num);
    }
}
