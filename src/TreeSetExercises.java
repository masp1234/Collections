import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// har lavet static metoder, da det ikke giver mening at skulle lave et object for at bruge dem.

public class TreeSetExercises {

    public static void main(String[] args) {
        Iterable<String> set = get3LetterAWords();
        printIterable(set);

    }
    public static void printIterable(Iterable<String> iterable) {
        for (String string: iterable) {
            System.out.println(string);
        }
    }

    public static Set<String> get3LetterAWords() {
        Set<String> set = new TreeSet();

        Scanner in = null;
        try {
            in = new Scanner(new File("moby.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        while (in.hasNext()) {
            String word = in.next();
            if (word.startsWith("a") && word.length() == 3) {
                set.add(word);
            }

        }
        return set;

    }
}
