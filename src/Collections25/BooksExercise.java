package Collections25;

import java.io.*;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BooksExercise {
    public static void main(String[] args) throws IOException {
        File book1984 = new File("1984.txt");
        File animalFarmBook = new File("animalFarm.txt");

        SortedSet<String> set1984 = loadWords(book1984);
        SortedSet<String> setAnimalFarm = loadWords(animalFarmBook);

        SortedSet<String> unique1984 = new TreeSet<String>(set1984);
        unique1984.removeAll(setAnimalFarm);
        System.out.println("All words in 1984:" + set1984.size());
        System.out.println("Unique Words in 1984: " + unique1984.size());

        SortedSet<String> uniqueAnimalFarm = new TreeSet<String>(setAnimalFarm);
        uniqueAnimalFarm.removeAll(set1984);
        System.out.println("All words in animal farm: " + setAnimalFarm.size());
        System.out.println("Unique Words in animal farm: " + uniqueAnimalFarm.size());

        set1984.retainAll(setAnimalFarm);
        System.out.println("Common words between 1984 and animalFarm: "+ set1984.size());
        displayWords(set1984);
    }

    private static  void displayWords(Set<String> words) {
        int index =0;
        for (String word: words) {
            System.out.printf("%-15s" , word);
            if (++index % 15 == 0) {
                System.out.println();
            }
        }
    }
    private static SortedSet<String> loadWords(File file) throws IOException {
        TreeSet<String> wordSet = new TreeSet<>();

        try(var br= new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("[^a-zA-Z]+");

                for (var word: words) {
                    wordSet.add(word.toLowerCase());
                }
            }
        }
        return wordSet;
    }

}
