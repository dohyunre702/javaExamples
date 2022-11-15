package doIt.ch06.bubbleSort;

import java.util.Scanner;

//왼쪽부터 교환하는 프로그램
public class Prac06Q1 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort2(int[] a, int n) {
        for(int i = n; i > 0; i--) { //뒤에서부터 count
            for(int j = 0; j < i-1; j++) {
                if(a[j] > a[j+1]) //앞의 2개 비교해서 교환하기
                    swap(a, j, j+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x =new int[nx];

        for(int i = 0; i < nx; i++) {
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
