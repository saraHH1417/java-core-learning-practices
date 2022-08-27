package FurtherOOP;

public class Monster extends GameObject{
    @Override
    public void describe() {
        System.out.println("I'm a monster.");
    }

    public String toString() {
        return "monster object";
    }
}
