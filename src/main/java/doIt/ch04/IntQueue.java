package doIt.ch04;

//링 버퍼. 배열의 처음이 끝과 연결되었다고 보는 자료구조.
//프런트와 리어 값을 업데이트하며 인큐, 디큐 수행 > 요소를 재배열해야 할 필요가 없으므로 시간복잡도는 항상 O(1)이다.
public class IntQueue {
    private int max;
    private int front; //첫 번째 요소 커서
    private int rear; //마지막 요소 커서
    private int num; //현재 데이터 수
    //front와 rear값이 같을 때 큐의 상태가 비어 있는지, 꽉 차있는지 구분하기 어렵다
    //그래서 num 변수를 따로 넣어 현재 데이터 수를 함께 조회
    private int[] que;

    //
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    //
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    //생성자
    public IntQueue (int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];         //큐 본체 배열 생성
        } catch (OutOfMemoryError e) {  //생성할 수 없음
            max = 0;
        }
    }

    //큐에 데이터 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max) {
            throw new OverflowIntQueueException();
        } else {
            que[rear++] = x;
            num++;
            if (rear == max) //rear 값이 max와 같아지면
                rear = 0; //rear=0으로 재배치해야 함
            return x;
        }
    }

    //큐에 데이터 디큐
    public int deque() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        } else {
            int x = que[front++];
            num--;
            if (front == max)
                front = 0;
            return x;
        }
    }

    //프런트 데이터 peek
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    //큐에서 x를 검색, 인덱스 찾지 못하면 -1 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max; //인덱스 계산. (스캔의 시작 = 0이 아니라 front)
            if (que[idx] == x)
                return idx;
        }
        return -1;
    }

    //큐 비우기
    public void clear() {
        num = front = rear = 0;
    }

    //큐 용량 반환
    public int capacity() {
        return max;
    }

    //큐에 쌓여 있는 데이터 수 반환
    public int size() {
        return num;
    }

    //큐가 비어 있는가?
    public boolean isEmpty() {
        return num <= 0;
    }

    //큐가 가득 차 있는가?
    public boolean isFUll() {
        return num >= max;
    }

    //큐 안의 모든 데이터를 프런트 > 리어 순으로 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i+front) % max] + " ");
            }
            System.out.println();
        }
    }
}
