package javaJungsuk;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        Set set= new HashSet();
        // Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for(int i = 0; set.size() < 25 ; i++) {
           set.add((int)(Math.random() * 50)+1+"");
        }

        Iterator it = set.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}

/*
23번째 line에서 에러 발생. : board[i][j] = (int) it.next();으로 코딩했을 경우
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at javaJungsuk.Bingo.main(Bingo.java:23)
 */