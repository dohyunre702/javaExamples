package opentutorials.arraylist.implementation;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        //addLast
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        //add
        numbers.add(1, 15);

        //addFirst
        numbers.addFirst(5);

        //remove
        System.out.println(numbers.remove(1));

        //removeFirst
        numbers.removeFirst();

        //removeLast
        numbers.removeLast();

        //toString
        System.out.println(numbers);

    }
}
