package doIt.ch03;

import java.util.Scanner;

//보초법을 활용한 선형검색
public class SeqSearchSen {
    public static int seqSearch02 (int[] a, int n, int ky) {
        int i = 0;
        a[n] = ky;

        while(true){
            if (a[i] == ky) //if 한 개만 쓰므로 판단 횟수 1/2만큼 감소
                break;
            i++;
        }
        return i == n? -1 : i; //찾은 값이 배열의 데이터인지, 보초값인지 판단
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); //배열의 길이 입력
        int[] x = new int[num+1]; //배열의 길이 = 입력값 num + 보초 공간 1

        for (int i = 0; i < num; i++) {
            x[i] = sc.nextInt(); //배열에 요소 추가
        }

        int ky = sc.nextInt(); //키값 = 보초값 입력 (따라서 조건 1인 i==n 성립 여부를 따지지 않아도 됨)
        int idx = seqSearch02(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            System.out.println(ky+"은(는) x[" + idx +"]에 있습니다.");
        }
    }
}
