package Integers20;

public class App {
    public static void main(String[] args) {
        // byte , short, integer, long
        byte maxByteValue = 123;
        short maxShortValue = 30000;
        int maxIntValue = 423434;
        long longValue = 345657687687878L; // for showing java that this number is long,
        // we should put L at the end of it
        float f = 123.57676f;
        double d = 456.567785636676;

        System.out.printf("Byte size is %d. It contains %d bytes. Byte min value is %d. Byte max value is %d.\n",
                Byte.SIZE, Byte.SIZE / 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short size is %d. It contains %d bytes.Short min value is %d. Short max value is %d.\n",
                Short.SIZE, Short.SIZE / 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Integer size is %d. It contains %d bytes. Integer min value is %d. Integer max value is %d.\n",
                Integer.SIZE, Integer.SIZE / 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long size is %d. It contains %d bytes. Long min value is %d. Long max value is %d.\n",
                Long.SIZE, Long.SIZE / 8, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Float size is %d. It contains %d bytes. Float min value is %f. Float max value is %f.\n",
                Float.SIZE, Float.SIZE / 8, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("formatting float number %.20f\n" , f);
        System.out.printf("Long size is %d. It contains %d bytes. Double min value is %f. Double max value is %f.\n",
                Double.SIZE, Double.SIZE / 8, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("formatting double number %.40f\n" , f);


        int testInt = 6767;
        long testLong = 4676878877343434678L;
        System.out.println("test int is " + testInt);
        System.out.println("test long is " + testLong);
        System.out.println("long number is " + testLong);

        long testLong2 = testInt;
        System.out.println("testLong 2 is " + testLong);

//        int testInt2 = testLong; it doesn't compile and gives error
        int testInt2 = (int)testLong;
        System.out.println("test int 2 is " + testInt2);

        Integer testIntClass = 7;
        Integer testIntClass2 = 7;
        System.out.println(testIntClass == testIntClass2);
        System.out.println(testIntClass.equals(testIntClass2));

        String testStringClass = "gggg";
        String testStringClass2 = "gggg";

        System.out.println(testStringClass == testStringClass2);
        System.out.println(testIntClass.equals(testStringClass2));
    }
}
