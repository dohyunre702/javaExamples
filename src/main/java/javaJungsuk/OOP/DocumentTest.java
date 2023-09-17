package javaJungsuk.OOP;

class Document {

    static {
        System.out.println("문서 저장을 시작합니다.");
    }

    static int count = 0;
    String name;
    String filetype = ".txt";

    Document() { //인스턴스 초기화 블럭을 생성자로 변형
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + concatenate(this.name, filetype) + "가 생성되었습니다.");
    }

    static String concatenate(String name, String delim) { //concatenate 메서드 추가
        String result = name + delim;
        return result;
    }

}
public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
