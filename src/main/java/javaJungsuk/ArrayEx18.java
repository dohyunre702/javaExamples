package javaJungsuk;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[] [] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
            };
        int sum = 0;

        for(int i =0; i < score.length;i++) {
            for(int j=0; j < score.length;j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }

        for (int[] tmp : score) { //약간.. [i for i in range]처럼 전체를 한 바퀴 돌림. 이터레이션?
            for (int i : tmp) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
