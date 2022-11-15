package doIt.ch06.bubblesort;

import java.util.Scanner;


//Q. 연산자 또는 문자 +, - 가 정수 배열에 들어간 채로 출력될 수 있나?
//저 배열 자체를 문자열 배열로 바꿔서 넣어야 하는 거 아닌가?
public class Prac06Q2 {
    //값 바꾸기
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

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

        System.out.println("버블 정렬(버전 1)-과정 출력");
        System.out.print("요솟수: ");
        int nx = sc.nextInt(); //7
        int cal = 2*nx - 1; //13
        int[] x =new int[cal];

        for(int i = 0; i*2 < cal; i++) { //짝수 배열에 요소 할당하기
            System.out.print("x[" + i + "]:");
            x[2*i] = sc.nextInt();
        }
       // bubbleSort(x, nx);
        System.out.println("오름차순 정렬:");
        for (int i = 0; i < cal; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
