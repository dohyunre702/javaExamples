package opentutorials.arraylist.implementation;

import java.util.ListIterator;

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

        //get
        System.out.println(numbers.get(1));

        //size
        numbers.size();

        //indexOf
        System.out.println(numbers.indexOf(20));

        //iterator
        ArrayList.ListIterator li = numbers.listIterator();
        while(true) { //초과 시 null..nextidx=100이후 에러
            System.out.println(li.next());
        }
    }
}