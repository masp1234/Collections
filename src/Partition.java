import java.util.LinkedList;
import java.util.List;

public class Partition {

    public static List<Integer> partition(List<Integer> list, int value) {
        // loop igennem listen og smid alle elementer < value ind i en ny liste, gør det igen og smid derefter
        // alle values ind som er højere end value.
        List<Integer> sortedList = new LinkedList<>();
        for (Integer integer: list) {
            if (integer <= value) {
                sortedList.add(integer);
            }
        }
        for (Integer integer: list) {
            if (integer > value) {
                sortedList.add(integer);
            }
        }
        return sortedList;
    }

    public static void main(String[] args) {
        List<Integer> intArray = new LinkedList<>();
        intArray.add(3);
        intArray.add(8);
        intArray.add(5);
        intArray.add(4);
        intArray.add(13);
        intArray.add(1);
        intArray.add(-9);
        intArray.add(7);
        intArray.add(-5);
        intArray.add(6);
        intArray.add(1);
        intArray.add(22);
        List sortedList = partition(intArray, 5);
        System.out.println(sortedList);



    }
}