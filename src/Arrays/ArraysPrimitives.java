package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysPrimitives {

    public static void main(String[] args) {
        System.out.println("*** primitive arrays");
        int[] numbers = null;
//        System.out.println("numbers length: "+ numbers.length);
        numbers = new int[3];
        System.out.println("numbers length: " + numbers.length);
        System.out.println("*** traverse numbers array");
        for (int num: numbers) {
            System.out.println(num);
        }


        System.out.println("non primitive arrays");
        String[] texts = null;
//        System.out.println("texts length:"+ texts.length);
        texts = new String[3];
        System.out.println("texts length: " + texts.length);

        System.out.println("*** Traverse  strings array");
        Arrays.stream(texts).forEach(System.out::println);
        texts[0] = "Hello";
        texts[1] = new String("How are you?");
        texts[2] = "Great Weather";

       for (String greeting: texts) {
           System.out.println(greeting);
       }

       // two dimentional array
        System.out.println("*** Multi-dimentional Array");
        String[][] multi = new String[][]{
                {"one" , "two" , "three"},
                {"four" , "five" , "six"},
                {"seven" , "eight" , "nine"}
        };
       for (String[] stringArray : multi) {
           for (String number: stringArray) {
               System.out.println(number);
           }
       }

       int[][] numbersMulti = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
       };

    }
}
