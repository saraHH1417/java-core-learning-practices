package Methods;

public class Person {
    public Person(double height) {
        this.height = height;
        System.out.println("Created a person!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    private String name; // if we don't write the access modifiers the default is public
    private int age;
    private double height;

    public void sayHello() {
        System.out.println("Hello");
    }

    public void setName(String theName) {
        this.name = theName;
    }

    public void setAge(int theAge) {
        this.age = theAge;
    }

    public String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}
