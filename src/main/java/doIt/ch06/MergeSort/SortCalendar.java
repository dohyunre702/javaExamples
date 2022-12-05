package doIt.ch06.MergeSort;

import java.util.Arrays;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

//Arrays.sort 활용하기 2. 클래스 객체 배열의 정렬(병합 정렬) - a.자연 정렬이 필요한 배열
//요소의 대소관계 비교하여 정렬
public class SortCalendar {
    public static void main(String[] args) {
        GregorianCalendar[] x = {
                new GregorianCalendar(2017, NOVEMBER, 1),
                new GregorianCalendar(1963, OCTOBER, 18),
                new GregorianCalendar(1985, APRIL, 5),
        };

        Arrays.sort(x); //배열 x를 정렬
        for(int i = 0; i< x.length; i++) {
            System.out.printf("%04년 %02월 %02일\n",
                    x[i].get(YEAR),
                    x[i].get(MONTH)+1,
                    x[i].get(DATE)
                    );
        }
    }
}
