package doIt.ch03;

//Comparator 인터페이스 이해하기

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysExamSearch {
    static class PhsycData {
        private String name;
        private int height;
        private double vision;

        public PhsycData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() { //문자열 리턴. 정보 확인용
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhsycData> HEIGHT_ORDER = new HeightOrderComparator();
        //ㄴPhsycData[]의 구성요소인 객체를 오름차순으로 정렬하기 위해 Comparator<PhsycData> 인스턴스를 생성.

        private static class HeightOrderComparator implements Comparator<PhsycData> {  //객체배열 정렬중..
            public int compare(PhsycData d1, PhsycData d2) {
                return (d1.height > d2.height) ?  1 :
                       (d1.height < d2.height) ? -1 : 0; //Integer.compare(d1.height, d2.height)로 변환가능
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhsycData[] x = { //x는 임의의 순서대로 구성된 객체배열
                new PhsycData("이나령", 162, 0.3),
                new PhsycData("유지훈", 168, 0.4),
                new PhsycData("김한결", 169, 0.8),
                new PhsycData("홍준기", 171, 1.5),
                new PhsycData("전서현", 173, 0.7),
                new PhsycData("이호연", 174, 1.2),
                new PhsycData("이수민", 175, 2.0),
        };

        System.out.println("몇 cm인 사람을 찾고 있나요?"); //키 값 입력
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(
                x,                                                  // 배열 x에서
                new PhsycData("", height, 0.0),         // 키가 height인 요소를
                PhsycData.HEIGHT_ORDER                              // HEIGHT_ORDER에 의해 검색
        );

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println("x[" + idx +"]에 있습니다.");
            System.out.println("찾은 데이터: "+ x[idx]);
        }
    }

}

