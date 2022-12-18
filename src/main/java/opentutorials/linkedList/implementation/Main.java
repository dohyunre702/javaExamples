package opentutorials.linkedList.implementation;

public class Main {
    public static void main(String[] args) {

        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);

        //add
        numbers.add(1,15);

        System.out.println(numbers);

    }
}
