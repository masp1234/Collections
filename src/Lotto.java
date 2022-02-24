import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

    public static Set<Integer> createCoupon() {
        Set<Integer> coupon = new HashSet();
        Random random = new Random();

        while (coupon.size() < 7) {
            int randomNumber = random.nextInt(40) + 1;
            coupon.add(randomNumber);
        }
        return coupon;
    }
    public static Set<Integer> createWinningNumbers() {
        Set<Integer> winningNumbers = new HashSet<>();
        Random random = new Random();
        while (winningNumbers.size() < 9) {
            int randomNumber = random.nextInt(40) + 1;
            winningNumbers.add(randomNumber);

        }
        return winningNumbers;

    }
    public static int checkCoupon(Set<Integer> coupon, Set<Integer> winningNumbers) {
        Set<Integer> intersection = new HashSet<>(coupon);
        intersection.retainAll(winningNumbers);

        return intersection.size();
    }
}
