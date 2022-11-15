package doIt.ch06.bubbleSort;

import java.util.Scanner;

public class BubbleSort {
    //값 바꾸기
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //버블정렬: 변수 i의 값을 0부터 n-2까지 1씩 증가하며 n-1회의 패스를 수행하는 프로그램
    static void bubbleSort(int[] a, int n) {
        for(int i = 0; i < n-1; i++) { //앞에서부터 count
            for(int j = n-1; j > i; j--) {
                if(a[j-1] > a[j]) //뒤의 2개 비교해서 교환하기
                    swap(a, j-1, j);
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
        bubbleSort(x, nx);
        System.out.println("오름차순 정렬:");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
