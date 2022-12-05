package doIt.ch06.QuickSort;

import doIt.ch04.IntStack;

//비재귀적인 퀵 정렬
public class QuickSort2 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right) {
        //스택 생성
        IntStack lstack = new IntStack(right - left + 1); //나눌 범위의 왼쪽 끝 요소의 인덱스를 저장하는 스택
        IntStack rstack = new IntStack(right - left + 1); //나눌 범위의 오른쪽 끝 요소의 인덱스를 저장하는 스택

        lstack.push(left);
        rstack.push(right);

        while(lstack.isEmpty() != true) {
            int pl = left = lstack.pop(); //왼쪽 커서
            int pr = right = rstack.pop(); //오른쪽 커서
            int x = a[(left + right) / 2]; //피벗

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr) swap(a,pl++,pr--);
            } while (pl<=pr);

            if (left < pr) {
                lstack.push(left); //왼쪽 그룹 범위의
                rstack.push(pr); //인덱스 푸시
            }

            if(pl < right) {
                lstack.push(pl); //오른쪽 그룹 범위의
                rstack.push(right); //인덱스 푸시
            }
        }
    }
}
