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
    public static Set<Integer> createAdditionalNumbers() {
        Set<Integer> additionalNumbers = new HashSet<>();
        Random random = new Random();
        while (additionalNumbers.size() < 2) {
            additionalNumbers.add(random.nextInt(40) + 1);
        }
        return additionalNumbers;
    }
    public static int checkCoupon(Set<Integer> coupon,
                                  Set<Integer> winningNumbers,
                                  Set<Integer> additionalNumbers) {
        // Får tallene som coupon og winningNumbers har tilfælles
        Set<Integer> intersection = new HashSet<>(coupon);
        intersection.retainAll(winningNumbers);

        // Tjekker tillægstalene, hvis man har 6 rigtige
        if (intersection.size() == 6) {
            Set<Integer> additionalNumbersIntersection = new HashSet<>(coupon);
            additionalNumbersIntersection.retainAll(additionalNumbers);

            // Putter alle de tillægstal der matcher kuponens tal i intersection, uanset om der er nogle
            intersection.addAll(additionalNumbersIntersection);
        }
        return intersection.size();
    }

    public static void main(String[] args) {
        System.out.println(checkCoupon(createCoupon(), createWinningNumbers(), createAdditionalNumbers()));
    }
}
