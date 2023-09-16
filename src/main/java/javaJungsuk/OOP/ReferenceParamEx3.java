package javaJungsuk.OOP;

public class ReferenceParamEx3 {
    public static void main(String[] args){
        int[] arr = new int[] {3,1,2,6,5,4};
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void printArr(int[] arr) { //배열의 모든 요소 출력
        System.out.println("[");

        for (int i : arr) //iteration
            System.out.println(i+",");
        /*
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i+",");
        }
        */
        System.out.println("]");

    }

    static int sumArr(int[] arr) { //배열의 합 출력
        int sum = 0;

        for (int i : arr)
            sum += arr[i];
        /*
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
         */
        return sum;
    }

    static void sortArr(int[] arr) { //배열 오름차순 정렬 (버블정렬)
            for(int i=0; i<arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j] = tmp;
                    }
                }
            }
    }
}
