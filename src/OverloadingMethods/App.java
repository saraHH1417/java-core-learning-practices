package OverloadingMethods;

public class App {
    public static void main(String[] args) {
        Person person = new Person();

        person.greet();

        person.greet("emiliy");

        person.greet("mia" , 164);

        System.out.println("Default constructors topic");
        Person person1 = new Person();
        System.out.println(person1);

        Person person2 = new Person("ema");
        System.out.println(person2);

        Person person3 = new Person("jim" , 175);
        System.out.println(person3);

        ConstructorChainingPerson personChain1 = new ConstructorChainingPerson();
        System.out.println(personChain1);

        ConstructorChainingPerson personChain2 = new ConstructorChainingPerson("july");
        System.out.println(personChain2);

        ConstructorChainingPerson personChain3 = new ConstructorChainingPerson(181);
        System.out.println(personChain3);

        ConstructorChainingPerson personChain4 = new ConstructorChainingPerson("duly", 143);
        System.out.println(personChain4);

        System.out.println("Employee class");

        Employee employee = new Employee("employee");
        System.out.println(employee);
    }
}
