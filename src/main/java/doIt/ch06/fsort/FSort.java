package doIt.ch06.fsort;

import java.util.Scanner;

//도수 정렬 (도수분포표 활용)
/* 도출 순서
1. 도수분포표 만들기
2. 누적도수분포표 만들기
3. 목적 배열 만들기
4. 배열 복사하기
 */
public class FSort {

    //도수 정렬(0이상 max 이하의 값 입력)
    static void fSort(int[] a, int n, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) f[a[i]]++; //1단계
        for (int i = 1; i <= max; i++) f[i] += f[i-1]; //2단계
        for (int i = n-1; i >= 0; i--) b[--f[a[i]]] = a[i]; //3단계
        for (int i = 0; i < n; i++) a[i] = b[i]; //4단계
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("도수 정렬");
        System.out.println("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            do {
                System.out.println("x[" + i + "]:");
                x[i] = stdIn.nextInt();
            } while (x[i] < 0);
        }

        //배열 x의 최댓값을 구해 max에 대입
        int max = x[0];
        for (int i = 1; i < nx; i++)
            if (x[i] > max) max = x[i];

        fSort(x, nx, max); //배열 x를 도수 정렬

        for (int i = 1; i< nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
