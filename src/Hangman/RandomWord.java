package Hangman;

import java.util.Random;

public class RandomWord {
    private String text = "give Pirrip as my father’s family name, on the authority of " +
            "his tombstone and my sister,—Mrs. Joe Gargery, who married the blacksmith. " +
            "As I never saw my father or my mother, and never saw any likeness of either " +
            "of them (for their days were long before the days of photographs), " +
            "my first fancies regarding what they were like were unreasonably " +
            "derived from their tombstones. The shape of the letters on my father’s, " +
            "gave me an odd idea that he was a square, stout, dark man, with curly " +
            "black hair. From the character and turn of the inscription, " +
            "“Also Georgiana Wife of the Above,” I drew a childish conclusion that " +
            "my mother was freckled and sickly. To five little stone lozenges, each " +
            "about a foot and a half long, which were arranged in a neat row beside their grave, " +
            "and were sacred to the memory of five little brothers of mine,—who gave up trying to " +
            "get a living, exceedingly early in that universal struggle,—I am indebted for a belief " +
            "I religiously entertained that they had all been born on their backs with their " +
            "hands in their trousers-pockets, and had never taken them out in this state of existence.";
    private String[] words = text.split(" ");
    private String chosenWord;
    private Random random = new Random();
    private char[] characters;

    public RandomWord() {

        chosenWord = words[random.nextInt(words.length)];
        characters = new char[chosenWord.length()]; // chosenWord is a string, string is an object, object has
        // methods , so we should use method length() for it , but if it was an array ,
        // we could use the length attribute for it
    }

    public String toString() {
        StringBuilder text = new StringBuilder("");

        for (char c : characters) {
            text.append(c == '\u0000' ? '_' : c);
            text.append(' ');
        }

        return text.toString();
    }

    public boolean isComplete() {
        for (char c : characters) {
            if (c == '\u0000') {
                return  false;
            }
        }
        return true;
    }

    public boolean addGuess(char c) {
        boolean correct = false;

        for(int i = 0 ; i < chosenWord.length(); i++) {
            if ( c == chosenWord.charAt(i)) {
                characters[i] = c;
                correct = true;
            }
        }
        return correct;
    }
}
