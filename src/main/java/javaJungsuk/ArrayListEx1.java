package javaJungsuk;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5)); //5를 list1 객체배열의 0번째 인덱스 (=0번째 객체)에 저장
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(1));

        ArrayList list2 = new ArrayList(list1.subList(1,4)); //subList(1,4) 1부터 4까지
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();

    }
}
