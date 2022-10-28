package doIt.ch05;

//분기 한정법 = 가지 뻗기 + 한정 조작
//한정 조작 : 필요하지 않은 분기를 없애 불필요한 조합을 줄이는 방법

public class QuenBB {
    static boolean[] flag = new boolean[8];
    static int[] pos = new int[8];

    static void print() {
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d", pos[1]);
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false) {
                pos[i] = j;
                if(i==j)
                    print();
                else {
                    flag[j] = true;
                    set(i+1);
                    flag[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
