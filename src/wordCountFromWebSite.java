import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class wordCountFromWebSite {


    public static Map<String, Integer> countWordsFromWebsite(List<String> words) {

        Map<String, Integer> wordCount = new TreeMap<>();
        wordCount.put("Putin", 0);
        wordCount.put("Trump", 0);
        wordCount.put("Biden", 0);
        wordCount.put("ukraine", 0);
        wordCount.put("rusland", 0);

        Set<String> searchWords = wordCount.keySet();
        for (int i = 0; i < words.size(); i++) {
            for (String s:searchWords) {
                int numberOfTimes = wordCount.get(s);
                if (s.equalsIgnoreCase(words.get(i))) {
                    wordCount.put(s, numberOfTimes + 1);
                }
            }
        }

        return wordCount;
    }


    public static List<String> getWordsFromWebSite() throws IOException {
        URL dr = new URL("https://dr.dk/");
        BufferedReader in = new BufferedReader(
            new InputStreamReader(dr.openStream()));
        List<String> words = new LinkedList<>();

        String inputLine = "";
        while (in.ready()) {
            String word = in.readLine();
            inputLine += word;
        }
        Scanner reader = new Scanner(inputLine);
        reader.useDelimiter("[^a-zA-Z]+");

        while (reader.hasNext()) {
            String word = reader.next();
            words.add(word.toLowerCase());
        }
        //System.out.println(words);
        return words;
    }

    public static void main(String[] args) throws IOException{
        Map<String, Integer> wordCount = countWordsFromWebsite(getWordsFromWebSite());
        System.out.println(wordCount);
    }
}
