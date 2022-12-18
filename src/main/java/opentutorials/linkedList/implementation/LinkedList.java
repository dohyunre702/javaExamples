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

    //addLast

    //node




}
