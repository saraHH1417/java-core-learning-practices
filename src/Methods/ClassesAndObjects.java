package Methods;

import java.util.Scanner;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person(1.45);
//        System.out.println(person1.name); // if don't initialize variables of class, the starting value is null by default
//        person1.name = "Mary";
        // the person object attributes are private so you should use getters and setters for them
        Person person2 = new Person(1.7);
//        person2.name = "Joe";
//
//        System.out.println(person1.name);
//        System.out.println(person2.name);

        person1.sayHello();

        Menu optionsMenu = new Menu();
        optionsMenu.display();
        System.out.println(optionsMenu.getMenu());


        ReturnValues values1 = new ReturnValues();
        String animal = values1.getAnimals();
        System.out.println(animal);

        // Calculator
        Calculator calculator = new Calculator();

        // getting number by input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your input > ");
        int numberInput = scanner.nextInt();

        int squared = calculator.square(numberInput);
        System.out.printf("the square of %d is %d", numberInput, squared);

        int add = calculator.add(1 , 3);
        System.out.println("The result of addition of 1 and 3 is: " + add);

        int addMultiple = calculator.addMultiple(1, 3, 5, 8);
        System.out.println("The result of add multiple is: " + addMultiple);

        /// getters and setters
        Person person3 = new Person(1.64);
        person3.setName("white");
        person3.setAge(2);

        System.out.println("The person name is " + person3.getName());
        System.out.println("The person age is " + person3.getAge());
        System.out.println("THe person height is "+ person3.getHeight());
        System.out.println("the toString result: "+ person3.toString());
        System.out.println(person3); // this also wil print the toString method result

        // window example
        Window  window = new Window();
        window.setWidth(300);

        System.out.println("The window width is " + window.getWidth());

    }
}
