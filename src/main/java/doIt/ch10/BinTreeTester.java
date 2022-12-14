package doIt.ch10;

import java.util.Scanner;

//이진검색트리 클래스 Bin<K,V>를 이용하는 프로그램
public class BinTreeTester {
    static Scanner stdIn = new Scanner(System.in);

    //회원번호 + 이름 저장
    static class Data {
        public static final int NO = 1; //회원번호를 입력받습니까?
        public static final int NAME = 2; //이름을 입력받습니까?

        private Integer no; //회원번호 (키 값)
        private String name; //이름

        //키 값
        Integer keyCode() {
            return no;
        }
        //문자열 반환
        public String toString() {
            return name;
        }
        //데이터 입력
            void scanData(String guide, int sw) {
                System.out.println(guide+"할 데이터를 입력하세요.");

                if ((sw & NO) == NO) System.out.println(":번호"); no = stdIn.nextInt();
                if ((sw & NAME) == NAME) System.out.println(":이름"); name = stdIn.next();
            }
        }

    //메뉴 열거형
    enum Menu {
        ADD("삽입"),
        REMOVE("삭제"),
        SEARCH("검색"),
        PRINT("표시"),
        TERMINATE("종료");

        private final String message; //출력할 문자열

        Menu(String string) { //생성자
            message = string;
        }

        public String getMessage() { //getter. 출력할 문자열 반환
            return message;
        }

        static Menu MenuAt(int idx) { //서수가 idx인 열거 반환
            for(Menu m : Menu.values())
                if (m.ordinal() == idx)
                    return m;
            return null;
        }
    }

    //메뉴 선택
    static Menu SelectMenu() {
        int key;
        do {
            for (Menu m : Menu.values())
                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
            System.out.println(":");
            key = stdIn.nextInt();
        } while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }

    public static void main(String[] args) {
        Menu menu; //메뉴
        Data data; //추가용 데이터 참조
        Data ptr; //검색용 데이터 참조
        Data temp = new Data(); //입력용 데이터
        BinTree<Integer, Data> tree = new BinTree<Integer, Data>();

        do {
            switch(menu = SelectMenu()) {
                case ADD :
                    data = new Data();
                    data.scanData("삽입", Data.NO | Data.NAME);
                    tree.add(data.keyCode(), data);
                    break;

                case REMOVE :
                    temp.scanData("삭제", Data.NO);
                    tree.remove(temp.keyCode());
                    break;

                case SEARCH :
                    temp.scanData("검색", Data.NO);
                    ptr = tree.search(temp.keyCode());
                    if (ptr != null)
                        System.out.println("그 번호의 이름은" + ptr + " 입니다.");
                    else
                        System.out.println("해당 데이터가 없습니다.");
                    break;

                case PRINT : //Integer: comparable인터페이스 구현 > 자연 순서 매기기 진행되므로 비교자 필요하지 않음
                    tree.print();
                    break;
            }
        } while (menu != Menu.TERMINATE);
    }
}
