import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Hello1");
        set1.add("Hello2");
        set1.add("Hello3");
        set1.add("Hello4");
        set1.add("Hello5");
        set1.add("Hello6");
        set1.add("Hello7");

        set2.add("Hello2");
        set2.add("Hello3");
        set2.add("Hello4");
        set2.add("Hello5");
        set2.add("Hello8");

        System.out.println(setContainsAllElements(set1, set2));

    }

    public static int totalElements(Set<String> set1, Set<String> set2) {
        Set<String> union = new HashSet<>(set1);
        System.out.println(union.size());
        union.addAll(set2);
        return union.size();
    }
    public static int elementsInCommon(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        System.out.println(intersection.size());
        intersection.retainAll(set2);
        return intersection.size();
    }
    public static int elementsDifference(Set<String> set1, Set<String> set2) {
        Set<String> difference = new HashSet<>(set1);
        System.out.println(difference.size());
        difference.removeAll(set2);
        return difference.size();
    }
    public static boolean setContainsAllElements(Set<String> set1, Set<String> set2) {
        Set<String> containsAll = new HashSet<>(set1);
        return containsAll.containsAll(set2);

    }
}
