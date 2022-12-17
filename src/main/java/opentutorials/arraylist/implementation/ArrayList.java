package opentutorials.arraylist.implementation;

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


}
