package InnerClass16;

public class Person {
    private String name;
    public static class Head {
        public void print() {
            System.out.println("Head");
        }
    }

    static class Body{
        public void print() {
            System.out.println("Body");
        }
    }

    public void print() {
        Head head = new Head();
        Body body = new Body();
        head.print();
        body.print();
    }

    public class Printer {
        public void print() {
            System.out.println(name);
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        Printer printer = new Printer();
        printer.print();
    }
 }

