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
    }
}
