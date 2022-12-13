package codingTest.greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//모험가 길드
public class AdvenGuild {
    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);

        int result = 0; //총 그룹의 수
        int count = 0; //현재 그룹에 포함된 모험가의 수
        for(int i = 0; i<n; i++) { //낮은 것부터 공포도 확인
            count +=1; //현재 그룹에 모험가 포함
            if (count >= arrayList.get(i)) { //현재 그룹의 모험가 수 > 현재 공포도 라면 그룹 결성
                result += 1; //총 그룹 수 증가
                count = 0; //현재 그룹에 포함된 모험가 수 초기화
            }
            System.out.println(result);
        }


    }
}
