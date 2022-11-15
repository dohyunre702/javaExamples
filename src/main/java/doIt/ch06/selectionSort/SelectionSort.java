package doIt.ch06.selectionSort;

import java.util.Scanner;

//정렬되지 않은 부분의 첫 번째 요소를 정렬된 열의 '알맞은 위치에 삽입'하는 작업을 n-1회 반복.
public class SelectionSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i; //아직 정렬되지 않은 배열의 최소 인덱스값
            for (int j = i+1; j < n; j++) {
                if (a[i] < a[min])
                    min = j;
            } swap(a,i,min);
        }
    }

    //테스트용 코드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("선택 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x =new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = sc.nextInt();
        }
        selectionSort(x, nx);
        System.out.println("오름차순 정렬:");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
