import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCountWithMap {
    final static int COUNT_LOWER_LIMIT = 2000;


    public static void main(String[] args) throws FileNotFoundException {

        // Prints the words that occured a specific number of times in Moby Dick
        Map<String, Integer> wordCountMap = wordCount();
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            if (count > COUNT_LOWER_LIMIT) {
                System.out.println(word + " appeared: " + count + " times.");
            }

        }
    }

    // Returns a TreeMap with the key(word)/value(occurences) from Moby dick
    public static Map<String, Integer> wordCount() throws FileNotFoundException {
        Map<String, Integer> wordCount = new TreeMap<>();
        Scanner in = new Scanner(new File("moby.txt"));
        while (in.hasNext()) {
            int counter = 1;
            String word = in.next();
            if (wordCount.containsKey(word)) {
                counter = wordCount.get(word);
                wordCount.put(word, counter + 1);
            } else {
                wordCount.put(word, counter);
            }
        }
        return wordCount;
    }
}
