import java.util.*;

public class RemoveEvenLength {

    public static void removeEvenLengthStrings(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() % 2 == 0) {
                iterator.remove();
            }
        }
    }
    public static void removeEvenLengthStrings2(LinkedList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() % 2 == 0) {
                strings.remove(i);
                i--;
            }
        }
    }
    public static void removeEvenLengthStrings(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() % 2 == 0) {
                strings.remove(i);
                i--;
            }
        }
    }
    public static String longest(Collection<String> list) {
        Iterator<String> itr = list.iterator();
        String result = itr.next();
        while (itr.hasNext()) {
            String current = itr.next();
            if (current.length() > result.length()) {
                result = current;
            }
        }
        return result;
    }
    // Tjek hvordan Iterator fungerer, ny liste eller??
    public static void removeInRange(LinkedList<Integer> list,
                                     int valueToBeRemoved,
                                     int startIndex,
                                     int endIndex) {
        Iterator<Integer> itr = list.iterator();
        int counter = 0;




    }


    public static void main(String[] args) {
        /*
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello123");
        strings.add("Hello12");
        strings.add("Hello1");

        System.out.println("Før strings med en lige længde er fjernet: " + strings.size());
        removeEvenLengthStrings(strings);
        System.out.println("Efter: " + strings.size());



        List<String> words = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            words.add("hello" + i);
        }
        System.out.println(words.size());
       //removeEvenLengthStrings(words);
        System.out.println(words.size());

        System.out.println(Collections.min(words));

*/
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(2);

        removeInRange(list, 2, 2, 5);
        System.out.println(list);


    }
}