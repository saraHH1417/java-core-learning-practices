package Bitwise32;

public class App {
    public static void main(String[] args) {
        int value = 123;
        System.out.println("The value is " + value);
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toHexString(value));

        System.out.println("Formatting binary values");

        int value2 = 0b1111011110000011111;
        System.out.println(toBinary(value2));

        System.out.println("\nBitwise & and or");
        int value3 = 0b0111100101;
        int value4 = 0b111001110;
        int result1 = value3 & value4;
        System.out.println(toBinary(value3));
        System.out.println(toBinary(value4));
        System.out.println(toBinary(result1));

        int result2 = value3 | value4;
        System.out.println(toBinary(result2));

        System.out.println("not operator ~ on value 3" + toBinary(~value3));

        System.out.println("\nShift operator");
        int value5 = 0b0010010010001010000001;
        int result3 = value5 << 3; // the 3 number is the number of elements that 1 should move
        int result4 = value5 >> 2;
        System.out.println("Left shifting " + toBinary(result3));
        System.out.println("Right shifting " + toBinary(result4));
        System.out.println("In numbers shift to the left means multiplying and shift to the right means deviding and it is faster compared to devide or multiple operator");
        System.out.println(100 << 2);
        System.out.println(300 << 2);
        System.out.println(100 >> 1);

        System.out.println("bitwise hexadecimal");
        int value6 = 0xFF;
        int result5 = value6 << 8;
        System.out.println(value6);
        System.out.println(result5);
    }

    public static String toBinary(int value) {
        return String.format("%8s", Integer.toBinaryString(value)).replace(" " , "0");
    }
}
