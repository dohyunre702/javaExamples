package doIt.ch06.bubbleSort;

import java.util.Scanner;

public class BubbleSort2 {
    static void swap(int[] a, int idx1, int idx2) {
        int x = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = x;
    }

    static void bubbleSort2(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0; //패스의 교환 횟수 기록
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            }
            if (exchg == 0) //더 이상 교환이 이루어지지 않는다 = 정렬이 끝났다
                break;
        }
    }

    //테스트용 실행 코드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전 2)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = sc.nextInt();
        }
        bubbleSort2(x, nx);
        System.out.println("오름차순 정렬:");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
