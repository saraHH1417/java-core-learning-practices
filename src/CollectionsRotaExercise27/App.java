package CollectionsRotaExercise27;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static String[][] peopleSkills = {
            {"Oliver", "programming", "electronics"},
            {"Jake", "reception", "engineering"},
            {"Amelia", "programming", "reception", "electronics", "management"},
            {"Noah", "management", "electronics"},
            {"James", "programming", "management", "electronics"},
            {"Margaret", "engineering", "electronics", "programming", "reception"},
            {"Emma" , "programming"},
            {"Jack", "engineering", "electronics"},
            {"Mary", "engineering", "electronics"}
    };


    public static void main(String[] args) {
        Rota rota = new Rota();
        rota.add(loadData());

        System.out.println(rota);
    }

    private static List<Person> loadData() {
        List<Person> people= new ArrayList<>();
        for (String[] personSkill: peopleSkills) {
            String name= personSkill[0];
            Person person = new Person(name);
            if(name.equals("Margaret")) {
                person.setOnHoliday(true);
            }
            for (int i = 1; i< personSkill.length; i++) {
                person.addSkill(Skill.valueOf(personSkill[i].toUpperCase()));
            }
            people.add(person);
        }
        return people;
    }

}
