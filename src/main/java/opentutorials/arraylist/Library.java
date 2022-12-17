package opentutorials.arraylist;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0,10);
        numbers.add(1,20);
        numbers.add(2,30);
        numbers.add(3,40);
        System.out.println("배열리스트 생성: " + numbers);

        //삽입
        numbers.add(1, 50);
        System.out.println("인덱스 1의 값 수정:" + numbers);

        //삭제
        numbers.remove(2); //인덱스 2 값 삭제
        System.out.println("인덱스 2의 값 삭제:" + numbers);

        //값 가져오기
        System.out.println("인덱스 2의 값 가져오기: " + numbers.get(2));

        //사이즈 반환
        System.out.println("데이터 사이즈 반환: " + numbers.size());

        //iteration(반복)
        Iterator it = numbers.iterator();
        System.out.println("\niterator");
        while(it.hasNext()) {
            int value = (int) it.next();
            if(value == 30){
                it.remove();
            }
            System.out.println(value);
        }
        System.out.println(numbers);

        //iterator for문
        System.out.println("nfor each");
        for(int value : numbers) {
            System.out.println(value);
        }

        System.out.println("nfor");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }


}
