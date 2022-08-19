package strings;

public class StringsPractice {
    public static void main(String[] args) {
        String name = "John";
        System.out.println("My name is: "+ name);

        String text = "I am called: " + name + ".";
        System.out.println(text);

        String questionSentence = "To be\t \\or\\ \tnot to be??\nThis is the question.";
        System.out.println(questionSentence);

        /*
         This is the course challenge
         */
        System.out.println("\t Select an option:");
        System.out.println("\t\t" + 1 + ". Add an entry");
        System.out.println("\t\t" + 2 + ". View the database");
        System.out.println("\t\t" + 3 + ". Exit");

        // Another way for challenge
        String prompt = "Select an option:";
        String option1 = "Add an entry";
        String option2 = "View the database";
        String option3 = "Exit";

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;

        String menu = "\t" + prompt + "\n";
        menu += "\t\t" + value1 + ". " + option1 + "\n";
        menu += String.format("\t\t%d. %s\n", value2, option2);
        menu += "\t\t" + value3 + ". " + option3 + "\n";

        System.out.println(menu);

    }
}
