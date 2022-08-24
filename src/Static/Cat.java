package Static;

public class Cat {
    private String name;
    public static final String FOOD = "Cat Food";
    private static int count = 0;
    private int id;

    static {
        System.out.println("Static initializer");
    }
    public Cat(String name) {
        this.name = name;
        id = count;
        count++;
    }

    public static int getCount() {
        return  count;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

//    private static String doSomething() {
//        return (name);
//    }
    public static int doSomething(int x) {
        return (x+5);
    }
}
