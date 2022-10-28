package doIt.ch05;

import doIt.ch04.IntStack;

//재귀의 제거 2. 스택 활용 (변수의 값을 '잠시' 저장하는 데 사용)
public class RecurX2 {
    static void recur (int n) {
        IntStack s = new IntStack(n);

        while(true) {
            if (n>0) {
                s.push(n);
                n = n - 1;
                continue;
            }

            if (s.isEmpty() != true) {
                n = s.pop(n);
                System.out.println(n);
                n = n -2;
                continue;
            }
        }
    }

}
