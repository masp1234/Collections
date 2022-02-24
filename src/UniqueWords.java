import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        Scanner reader = null;
        try {
            reader = new Scanner(new File("moby.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        while (reader.hasNext()) {
            String word = reader.next();
            word = word.toLowerCase();
            words.add(word);

        }
        System.out.println(words.size());

        // Kører igennem settet med Iterator, men man kan bruge enhanced for loop i stedet.

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }

    }
}
