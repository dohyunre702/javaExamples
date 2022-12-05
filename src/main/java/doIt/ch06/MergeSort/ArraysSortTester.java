package doIt.ch06.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

//Arrays.sort 활용하기 1. 기본 자료형 배열의 정렬(퀵 정렬)
public class ArraysSortTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟수: ");

        int num = stdIn.nextInt();
        int[] x = new int[num]; //배열의 크기는 num입니다.

        for(int i = 0; i<num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        Arrays.sort(x); //배열 x를 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i<num; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
