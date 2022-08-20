package loopsAndConditions;

public class StringEquality {
    public static void main(String[] args) {
        String text1 = "apple";
        String text2 = "apple";

        System.out.println(text1.equals(text2));

        System.out.println("Final key word");
        // final keyword in java
        final int VALUE = 9;
        System.out.println(VALUE);
//        value = 10;
        // it is convention that constants be uppercase letters in java , wer define constants with final keyword
        final String TEST_WORD = "test word";
//        testWord = "test word 2"; we can't change test word because it is final
        System.out.println(TEST_WORD);

        System.out.println("Break Keyword");
        // break keywork
        int count = 0;
        while(true) {
            System.out.println("hello-" + count);

            if(count == 5) {
                break;
            }
            System.out.println("how are you?");
            count++;
        }

        System.out.println("Break word section finished");
    }
}
