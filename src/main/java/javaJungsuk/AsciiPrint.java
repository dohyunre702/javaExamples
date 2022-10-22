package javaJungsuk;

public class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';
        //' '(공백) 이후의 문자열 출력
        for (int i = 0; i <95; i++) {
            System.out.print(ch++);
            //output :  !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}~
        }
    }
}
