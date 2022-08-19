package strings;

public class StringFormat {
    public static void main(String[] args) {
        // string format
        float floatValue = 1.56578778787866f;
        double doubleValue = 2.5657677878676;
        System.out.printf("The float value is: %f and the double value is: %f ***", floatValue, doubleValue);
        System.out.println(" Note that float number hasn't printed more than 6 decimals," +
                " because the maximum count of numbers which a float can save is 6 decimals");
        System.out.printf("Here I format this double number %.3f to not print more than three decimals" , doubleValue);
    }
}
