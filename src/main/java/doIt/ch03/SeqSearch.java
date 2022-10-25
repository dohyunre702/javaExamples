package doIt.ch03;

import java.util.Scanner;

public class SeqSearch {
    //길이가 n인 배열 a에서 key와 같은 요소를 선형 검색한다. (while문)
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 길이: ");
        int num = stdIn.nextInt(); //num (배열의 길이 입력)
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"]:");
            x[i] = stdIn.nextInt(); //배열의 요소 입력
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt(); //검색할 값 입력

        int idx = seqSearch(x, num, ky);

        if (idx  == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }

}

//for문
    /*
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            if (a[i]==key)
                return i;
            return -1;
        }
    }
     */