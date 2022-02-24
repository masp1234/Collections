import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckListForDuplicates {


    public static void main(String[] args) {

    }



    public static boolean checkListForDuplicates(List<Integer> list) {
        Set<Integer> newList = new HashSet<Integer>(list);
        return list.size() > newList.size();
    }
}
