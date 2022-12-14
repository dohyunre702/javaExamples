package doIt.ch10;

import java.util.Comparator;

public class BinTree <K,V> {

    static class Node<K, V> { //노드 클래스
        //노드
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;

        //생성자
        public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        //키 값 반환
        K getKey() {
            return key;
        }

        //value 값 반환
        V getValue() {
            return data;
        }

        //데이터 출력
        void print() {
            System.out.println(data);
        }

    }

    //이진검색트리 클래스 BinTree<K,V>
    private Node<K, V> root; //루트
    private Comparator<? super K> comparator = null; //비교자

    //생성자: 자연 순서에 따라 키 값 비교
    public BinTree() {
        root = null;
    }

    //생성자: 비교자로 키 값 비교. 인수로 비교자를 전달받는다.
    public BinTree(Comparator<? super K> c) {
        this(); //인수를 전달받지 않은 생성자 BinTree 호출. root가 null인 이진검색트리 생성
        comparator = c; //필드 coparator에 전달받은 c 설정
    }

    //두 키 값을 비교
    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) //삼항연산
                : comparator.compare(key1, key2);
    }

    //키에 의한 검색
    public V search(K key) {
        Node<K, V> p = root;
        while (true) {
            if (p == null) return null; // 더 이상 진행하지 않으면 검색 실패
            int cond = comp(key, p.getKey()); //key와 node p의 키 비교
            if (cond == 0)
                return p.getValue(); //검색 성공
            else if (cond < 0)
                p = p.left;
            else p = p.right;
        }
    }

    //node를 루트로 하는 서브 트리에 노드 <K, V>를 삽입
    private void addNode(Node<K, V> node, K key, V data) {
        int cond = comp(key, node.getKey());
        if (cond == 0) return;
        else if (cond < 0) {
            if (node.left == null)
                node.left = new Node<K, V>(key, data, null, null);
            else addNode(node.left, key, data);
        } else {
            if (node.right == null)
                node.right = new Node<K, V>(key, data, null, null);
            else addNode(node.right, key, data);
        }
    }

    //노드 삽입
    public void add(K key, V data) {
        if (root == null) {
            root = new Node<K, V>(key, data, null, null);
        } else {
            addNode(root, key, data);
        }
    }

    //키 값이 key인 노드 삭제
    public boolean remove(K key) {
        Node<K, V> p = root; //스캔 중인 노드
        Node<K, V> parent = null; //스캔 중인 노드의 부모 노드
        boolean isLeftChild = true; //p는 부모의 왼쪽 자식 노드인가?

        while (true) {
            if (p == null) return false; //더 이상 진행하지 않으면 그 키 값은 없다

            int cond = comp(key, p.getKey()); //key와 노드 p의 키값 비교
            if (cond == 0) break; //같으면 검색 성공
            else {
                parent = p; //가지로 내려가기 전에 부모 설정
                if (cond < 0) {
                    isLeftChild = true; //왼쪽 자식으로 내려감
                    p = p.left;
                } else {
                    isLeftChild = false; //오른쪽 자식으로 내려감
                    p = p.right;
                }
            }
        }

        if (p.left == null) { //p에 왼쪽 자식이 없다면
            if (p == root) root = p.right;
            else if (isLeftChild) parent.left = p.left; //부모의 왼쪽 포인터가 오른쪽 자식을 가리킴
            else parent.right = p.right; //부모의 오른쪽 포인터가 오른쪽 자식을 가리킴
        } else if (p.right == null) { //p에 오른쪽 자식이 없다면
            if (p == root) root = p.left;
            else if (isLeftChild) parent.left = p.left; //부모의 왼쪽 포인터가 왼쪽 자식을 가리킴
            else parent.right = p.left; //부모의 오른쪽 포인터가 왼쪽 자식을 가리킴
        } else {
            parent = p;
            Node<K,V> left = p.left;  //서브 트리 가운데 가장 큰 노드
            isLeftChild = true;
            while (left.right != null) { //가장 큰 노드 left 검색
                parent = left;
                left = left.right;
                isLeftChild = false;
            }
            p.key = left.key; //left의 키 값을 p로 옮김
            p.data = left.data; //left의 데이터를 p로 옮김
            if (isLeftChild) parent.left = left.left; //left 삭제
            else parent.right = left.left; //left 삭제
        }
        return true;
    }

    //node를 루트로 하는 서브 크리의 노드를 키 값의 오름차순으로 출력
    private void printSubTree(Node node) {
        if (node != null) {
            printSubTree(node.left); //왼쪽 서브 트리를 키 값의 오름차순으로 출력
            System.out.println(node.key + " " + node.data); //node를 출력
            printSubTree(node.right); //오른쪽 서브 트리를 키 값의 오름차순으로 출력
        }
    }

    //모든 노드를 키 값의 오름차순으로 출력
    public void print() {
        printSubTree(root);
    }
}
