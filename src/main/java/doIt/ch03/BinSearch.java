package doIt.ch03;

import java.util.Scanner;

//이진검색
public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;
    }

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

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println(ky + "은/는 x[" + idx +"]에 있습니다.");
        }
    }


    }
