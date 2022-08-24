package Static;


public class App {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Horace");
        Cat cat2 = new Cat("Matila");
        Cat cat3 = new Cat("Jollie");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat1.FOOD);
        System.out.println("static count variable cat3 " + cat3.getCount());
        System.out.println("static class attribute " + Cat.FOOD);
        System.out.println("static count class method " + Cat.getCount());
        System.out.println("static method do sth: " + Cat.doSomething(67));
    }
}
