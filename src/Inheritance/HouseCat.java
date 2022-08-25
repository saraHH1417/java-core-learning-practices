package Inheritance;

public class HouseCat extends Cat{
    @Override
    public void vocalize() {
        super.vocalize();
        System.out.println("Meeeouww!");
    }

    public void purr() {
        System.out.println("Purrrrr!");
    }
}
