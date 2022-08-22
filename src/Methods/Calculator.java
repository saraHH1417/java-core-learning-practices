package Methods;

public class Calculator {
    int square(int value) {
        return value * value;
    }

    int add(int value1, int value2) {
        return value1 + value2;
    }

    int addMultiple(int ...values) {
        int result = 0;
        for (int value:
             values) {
            result += value;
        }
        return  result;
    }
}
