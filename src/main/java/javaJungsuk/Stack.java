package javaJungsuk;

import java.util.EmptyStackException;

//백엔드 위키에서 공유된 코드
public class Stack {
    private int[] stack;
    private int pointer = -1;

    //10000으로 초기 설정
    public Stack() {
        this.stack = new int[10000];
    }

    //size를 입력받으면 size에 따라 초기화
    public Stack(int size) {
        this.stack = new int[size];
    }

    public int[] getArr(){
        return this.stack;
    }


    /*public void push(String value) {
        this.stack[++this.pointer] = value;
    }*/

    public int pop() {//메서드 동작 위해 isEmpty()메서드 필요
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        return stack[pointer--]; //초기 pointer(top)을 -1으로 설정한 경우 후위 연산자 사용
    }

    public boolean isEmpty(){
        if (pointer == -1) //첫 pointer 값
            return true;
        return false;
    }

    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[pointer];
    }

    public void push(String s) {
    }
}