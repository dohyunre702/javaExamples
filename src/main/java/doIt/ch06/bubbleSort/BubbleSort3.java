package doIt.ch06.bubbleSort;

import java.util.Scanner;

public class BubbleSort3 {
    //한 패스에서 더 이상 교환할 값이 없다면 교환을 중지하고 다음 패스로 넘{긴다.
    static void swap(int[] a, int idx1, int idx2){
        int x = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = x;
    }

    static void bubbleSort3(int[] a, int n) {
        int k = 0;
        while (k < n-1) {
            int last = n-1;
            for (int j = n-1; j>k; j--)
                if (a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    last = j; //이미 계산이 끝난 인덱스값을 더해서 앞에까지 비교하지 않도록 한다.
                }
            k=last;
        }

    }

    //테스트용 실행 코드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = sc.nextInt();
        }
        bubbleSort3(x, nx);
        System.out.println("오름차순 정렬:");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
