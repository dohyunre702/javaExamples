package doIt.ch03;

//int형 배열에서 binarySearch 활용

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열의 길이: ");
        int num = stdIn.nextInt();
        int[] x = new int[num]; //배열 길이가 num인 배열 x

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] :");
        x[0] = stdIn.nextInt(); //0번째 수는 직접 입력


        for(int i = 0; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i-1]); //새로 입력한 요소가 앞의 요소보다 작으면 재입력
        }

        System.out.println("검색할 값 입력: ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky); //배열 x에서 키 값이 ky인 요소 검색

        if (idx == -1) {
            System.out.println("삽입 포인트는 "+ (-ky-1));
        } else {
            System.out.println(ky + "은/는 x[" + idx +"]에 있습니다.");
        }
    }
}
