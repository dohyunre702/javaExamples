package opentutorials.linkedList.implementation;

public class LinkedList {
    //노드 생성
    private Node head; //처음 노드
    private Node tail; //끝 노드
    private int size = 0; //용량

    private class Node { //inner class
        private Object data;
        private Node next;
        public Node(Object input) { //노드가 처음 생성되었을 때 값
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
     }

    //addFirst
    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //addLast
    public void addLast(Object input) {
        Node newNode = new Node(input);
        if(size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    //node: 인덱스값에 해당하는 노드 객체 리턴
    Node node(int idx) { //외부에 노출되면 안되는 내부 객체
        Node x = head;
        for(int i = 0; i < idx; i++) {
            x = x.next;
        }
        return x;
    }

    //add
    public void add(int k, Object input) {
        if(k == 0) addFirst(input);
        else {
            Node tmp1 = node(k-1);
            Node tmp2 = tmp1.next;
            Node newNode = new Node(input);
            tmp1.next = newNode;
            newNode.next = tmp2;
            size++;
            if(newNode.next == null) tail = newNode;
        }
    }

    public String toString() {
        if(head == null) return "[]";
        Node tmp = head;
        String str = "[";

        while(tmp.next != null) {
            str += tmp.data + ", ";
            tmp = tmp.next;
        }
        str += tmp.data;
        return str + "]";
    }

    //removeFirst
    public Object removeFirst() {
        Node tmp = head;
        head = head.next;
        Object returnData = tmp.data;
        tmp = null;
        size--;
        return returnData;
    }

    //remove
    public Object remove(int k) {
        if (k == 0) return removeFirst();
        Node tmp = node(k-1);
        Node todoDeleted = tmp.next;
        tmp.next = tmp.next.next;
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail) tail = tmp;
        todoDeleted = null;
        size--;
        return returnData;
    }

    //removeLast
    public Object removeLast() {
        return remove(size-1);
    }


}
