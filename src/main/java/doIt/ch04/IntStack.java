package doIt.ch04;

public class IntStack {
    private int max;    //스택의 용량
    private int ptr;    //스택에 쌓인 데이터 수
    private int[] stk;  //스택 본체

    //실행 예외 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    //실행 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    //생성자 : 스택 본체용 배열 생성
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e){ //예외처리 : 스택 생성 불가
            max = 0;
        }
    }

    //push
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max) {
            throw new OverflowIntStackException();
        }
        return stk[ptr] = x;
    }

    //pop
    public int pop(int x) throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr] = x;
    }

    //peek
    public int peek(int x) throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr-1]; //꼭대기의 요소값 반환
    }

    //indexOf (검색)
    public int indexOf(int x) {
        for (int i = ptr - 1; i>=0 ; i++) { //위쪽에서 선형탐색
            if (stk[i] == x) {
                return i;
            }
        } return -1; //스택에 값 없음.
    }

    //clear : 스택 비우기
    public void clear(int x) {
        ptr = 0;
    }

    //capacity : 스택 용량 반환
    public int capacity(int x) {
        return max;
    }

    //size : 스택에 쌓인 데이터 수 반환
    public int size(int x) {
        return ptr;
    }

    //isEmpty : 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    //isFull : 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= max;
    }

    //스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        }
        else {
            for (int i = 0; i < ptr; i++) {
                System.out.println(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
