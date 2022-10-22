package javaJungsuk;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        System.out.println(length);

        List list = new ArrayList(length/LIMIT + 10); //43 / 10 + 10? list 지정 시 타입을 List 인터페이스에서 바로 데려 옴. 왜?

        for(int i=0; i<length; i+=LIMIT) {
            if (i+LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
