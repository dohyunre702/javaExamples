package opentutorials.arraylist.implementation;

import java.util.ListIterator;

//배열을 사용한 리스트 자료구조 만들기
public class ArrayList {
    //객체 생성
    private int size = 0; //리스트 용량
    private Object[] elementData = new Object[100];

    public boolean addFirst(Object element) { //addFirst(): 리스트의 처음에 데이터 추가
        return add(0, element);
    }

    public boolean addLast(Object element) {  //addLast(): 리스트의 끝에 데이터 추가
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean add(int idx, Object element) { //add(): 리스트에 데이터 삽입
        for(int i = size - 1; i >= idx; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[idx] = element;
        size++;
        return true;
    }

    public Object remove(int idx) { //remove(): 인덱스에 해당하는 값 삭제
        Object removed = elementData[idx];
        for(int i = idx+1; i < size; i++) {
            elementData[i-1] = elementData[i];
        }
        size--;
        elementData[size] = null;
        return removed;
    }

    public Object removeFirst() { //첫번째 값 삭제
        return remove(0);
    }

    public Object removeLast() { //마지막 값 삭제
        return remove(size-1);
    }

    public String toString() { //객체를 문자열로 출력
        String str = "[";
        for(int i = 0; i < size; i++) {
            str += elementData[i];
            if(i < size-1) {
                str += ",";
            }
        }
        return str + "]";
    }

    public Object get(int idx) { //인덱스에 해당하는 값 리턴
        return elementData[idx];
    }

    public int size() { //용량
        return size;
        //변수 직접 접근하지 않고 메소드 사용하는 이유는,
        //외부에서 size변수값을 마음대로 수정하지 못하기 때문
    }

    public int indexOf(Object o) { //검색하기
        for(int i = 0; i < size; i++) {
            if (elementData[i] == o) return i;
        }
        return -1; //찾는 값이 없다
    }

    //내부 클래스 ListIterator
    public ListIterator listIterator() { //접근제어자 + 데이터 타입 + 메소드
        return new ListIterator();
    }

    class ListIterator{
        private int nextIdx = 0;
        public boolean hasNext() {
            return nextIdx < size();
        }
        public Object next() {
            return elementData[nextIdx++];
            /* = 같은 코드
            Object returnData = elementData[nextIdx];
            nextIdx++;
            return returnData;
             */
        }
        public boolean hasPrevious() {
            return nextIdx > 0;
        }
        public Object previous() {
            return elementData[--nextIdx];
        }

        public void add(Object element) {
            ArrayList.this.add(nextIdx++, element); //add 메서드명 충돌 방지를 위함
        }

        public void remove() { //현재의 엘리먼트 삭제 > 엘리먼트 한번이라도 next한 뒤 사용해야 함
            ArrayList.this.remove(nextIdx-1);
            nextIdx--;
        }
    }
}
