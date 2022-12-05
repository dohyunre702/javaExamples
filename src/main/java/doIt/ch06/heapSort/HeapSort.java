package doIt.ch06.heapSort;

import java.util.Scanner;

//힙 정렬 > 가장 크거나 작은 값을 빼서 정렬하므로 남은 트리가 힙이 형태를 유지할 수 있도록 재구성해야 함.
/* 알고리즘 순서
0. 초기 배열을 힙 상태로 만든다
1. 변수 i의 값을 n-1로 초기화
2. a[0]과 a[i]를 바꾼다
3. a[0], a[1], ..., a[i-1]을 힙으로 만든다
4. i의 값을 1씩 줄여 0이 되면 끝난다. 그렇지 않으면 '2'로 돌아간다.
 */

public class HeapSort {
    //swap: 배열 요소 a[idx1]과 a[idx2]의 값을 바꾼다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //a[left] ~ a[right]을 힙으로 만든다.
    static void downHeap(int[] a, int left, int right) {
        int temp = a[left]; //루트
        int child; //큰 값을 가진 노드
        int parent; //부모

        for(parent = left; parent < (right + 1)/ 2; parent = child) {
            int cl = parent * 2 + 1; //왼쪽 자식
            int cr = cl + 1; //오른쪽 자식
            child = (cr<=right && a[cr] > a[cl]) ? cr : cl; //큰 값을 가진 노드를 자식에 대입
            if(temp >= a[child])
                break;
            a[parent] = a[child];
        }
        a[parent] = temp;
    }

    //힙 정렬
    static void heapSort(int[] a, int n) {
        for(int i = (n-1) / 2; i >= 0; i--) downHeap(a, i, n-1); //downHeap 메서드로 a[i]~a[n-1]을 힙으로 만들기

        for(int i = (n-1); i > 0; i--) {
            swap(a, 0, i); //가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
            downHeap(a, 0, i-1); //a[0]~a[i-1]을 힙으로 만든다
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.println("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        heapSort(x,nx); //배열 x를 힙 정렬

        System.out.println("오름차순으로 정렬했습니다");
        for(int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
