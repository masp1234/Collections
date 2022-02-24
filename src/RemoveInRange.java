import java.util.Iterator;
import java.util.LinkedList;

public class RemoveInRange {

    // Fjerner det angivne tal inden for et bestemt interval af index positioner
    public static LinkedList<Integer> removeInRange(LinkedList<Integer> list,
                                                    int numberToBeRemoved,
                                                    int startIndex,
                                                    int endIndex) {
        Iterator<Integer> itr = list.iterator();
        int counter = 0;

        while (itr.hasNext()) {
            int currentNumber = itr.next();
            if (counter >= startIndex && counter < endIndex && currentNumber == numberToBeRemoved) {
                itr.remove();
            }
            counter ++;
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(3);

        System.out.println(list);

        removeInRange(list, 2, 4, 11 );

        System.out.println(list);
    }
}
