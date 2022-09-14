package Collections25.Videos51To54;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Map of sets");
        List<Set<String>> exerciseRota = new ArrayList<>();
        exerciseRota.add(new HashSet<String>(Set.of("pushups", "pullups", "leg raises")));
        exerciseRota.add(new LinkedHashSet<>(Set.of("working" , "start jumps", "cycling")));
        exerciseRota.get(1).add("swimming");
        exerciseRota.get(1).add("running");

        for (var day: exerciseRota) {
            for (var exercise: day) {
                System.out.print(exercise);
                System.out.print(" ");
            }
            System.out.println();
        }

        Set<String> exercises = exerciseRota.get(0);

        for (var exercise: exercises) {
            System.out.println(exercise);
        }

        System.out.println("Map of Lists");
        Map<Integer, List<String>> societies = new HashMap<>();

        societies.put(0, new LinkedList<String>(List.of("AU", "IR", "JP", "GE", "US", "UK")));
        societies.put(1, new LinkedList<String>(List.of("BE", "NO", "SW", "BR")));

        for (Map.Entry<Integer, List<String>> society: societies.entrySet()) {
            var id = society.getKey();
            var countries = society.getValue();
            countries.forEach(i -> {
                System.out.printf("%-7s", i);
            });
        }

        System.out.println("Set of sets");
        Set<Set<String>> setOfSets = new HashSet<>();
        Set<String> item = new TreeSet<>();
        setOfSets.add(item);

        item.add("three");
        item.add("two");
        item.add("one");

        for (Set<String> set : setOfSets) {
            System.out.println(set);
        }

        System.out.println("Map of skillset");
        Map<Integer, SkillSet<String>> map = new HashMap<>();
        SkillSet<String> skillSet = new SkillSet();
        skillSet.addAll(Set.of("programming", "studying", "intelligence" , "english" , "deutsch"));

        map.put(0, skillSet);
        System.out.println(skillSet.isComplete());

        for (Map.Entry<Integer, SkillSet<String>> enrty: map.entrySet()) {
            System.out.println(enrty.getKey() + ": " + enrty.getValue());
        }
    }
}
