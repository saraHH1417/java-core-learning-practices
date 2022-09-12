package Collections25.IteratingList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3));
//        for (var n: list) {
//            list.remove(n);
//        }  //ConcurrentModificationException

        System.out.println("\n Iterator model one");
        ArrayList<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        for (Iterator<Integer> it = integerList.iterator(); it.hasNext(); ) {
            Integer number = it.next();
            System.out.println(number);
        }

        System.out.println("\nIterator model two");
        Iterator it = integerList.iterator();
        for (int i =0; i < integerList.size(); i++) {
            System.out.println(it.next());
        }

        System.out.println("\nIterator model 3:");
        Iterator integerIterator= integerList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println("has next: " + integerIterator.hasNext());
            System.out.println(integerIterator.next());
        }

        System.out.println("\nModifying list while iterating");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));

        for (ListIterator<Integer> listIterator = numbers.listIterator(); listIterator.hasNext();) {
            int number= listIterator.next();
            if (number == 2) {
                listIterator.remove();
            } else if(number == 3) {
                listIterator.add(10);
            } else if (number == 1) {
                listIterator.set(100);
            }
            System.out.println(number);
        }

        System.out.println();
        numbers.forEach(System.out::println);

        System.out.println("\nRing Exercise");
        Ring<Integer> ring = new Ring<>(3);

        ring.add(1);
        ring.add(2);
        ring.add(3);
        ring.add(4);
        ring.add(5);

        for (int i =0; i < ring.size(); i++) {
            System.out.println(ring.get(i));
        }

        System.out.println("\nWriting custom iterator");
        for (var customIterator = ring.iterator(); customIterator.hasNext(); ) {
            System.out.println(customIterator.next());
        }

        System.out.println("\nCircular ring iterator video 29 collections section");
        CircularRingIterator<Integer> circularRing= new CircularRingIterator<>(3);
        circularRing.add(1);
        circularRing.add(2);
        circularRing.add(3);
        circularRing.add(4);
        circularRing.add(5);
        for (var cit = circularRing.iterator(); cit.hasNext();) {
            System.out.println(cit.next());
        }
        
    }
}
