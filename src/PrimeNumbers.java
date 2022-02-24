import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Få alle primtal fra 2 og til det antal der indtastes: ");
        int max = scanner.nextInt();
        System.out.println("Primtalene er: ");
        List<Integer> primes = primeNumbers.sieve(max);
        for (Integer prime: primes) {
            System.out.println(prime);
        }

    }
       public List<Integer> sieve(int max) {
            List<Integer> primes = new LinkedList<>();
            List<Integer> numbers = new LinkedList<>();
            numbers.add(2);

            for (int i = 3; i <= max; i += 2) {
                numbers.add(i);
            }

            while (!numbers.isEmpty()) {
                int front = numbers.remove(0);
                primes.add(front);

                Iterator<Integer> itr = numbers.iterator();
                while (itr.hasNext() && front <= Math.sqrt(max) ) {
                    int current = itr.next();
                    if (current % front == 0) {
                        itr.remove();
                    }
                }
            }
            return primes;
        }
        }
