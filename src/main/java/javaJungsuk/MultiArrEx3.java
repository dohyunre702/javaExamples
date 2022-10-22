package javaJungsuk;

public class MultiArrEx3 {
    //행렬의 곱셈. (2*3) * (3*2)
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length;
        final int COL = m2[0].length;
        final int M2_ROW = m2.length;

        int[][] m3 = new int[ROW][COL];

        //행렬곱 m1 * m2를 m3에 저장
        for (int i = 0; i < ROW; i++)  //0~2
            for (int j = 0; j < COL; j++) //0~2
                for (int k = 0; k < M2_ROW; k++)
                    m3[i][j] += m1[i][k] * m2[k][j];

        /*위의 3중 for문은 아래 이중 for문에서 중복을 제거한 것
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COL; j++)
                //m3[i][j] = m1[i][0] + m2[0][j]
                             m1[i][1] + m2[1][j]
                             m1[i][2] + m2[2][j]
        */

        //행렬 m3 출력
        for (int i = 0; i<ROW; i++)
            for (int j = 0; j<COL; j++) {
                System.out.printf("%3d ", m3[i][j]);
            }
        System.out.println();
    }
}
