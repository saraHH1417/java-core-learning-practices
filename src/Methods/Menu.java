package Methods;

public class Menu {
    String[] options = {"Add an item" , "View Items" , "Delete an item", "Quit the program"};
    void display() {
        System.out.println("Choose an option:");

        for (int i =0 ; i < options.length; i++) {
            System.out.printf("\t%d. %s\n", i, options[i]);
        }
    }

    String getMenu() {
        StringBuilder menuText = new StringBuilder("Choose an option:\n");

        for (int i =0 ; i < options.length; i++) {
//            menuText.append(String.format("\t%d. %s\n", i, options[i]));
//            this solution is bad because of using string format,
//            I think this method will create another unnecessary additional object
            menuText.append("\t").append(i).append(". ").append(options[i]).append("\n");
        }
        return menuText.toString();
    }
}
