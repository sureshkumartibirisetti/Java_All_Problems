package InterviewProblems;
//1 to n to check prime numbers PrimeLargeSieveOfEratosthenes
import java.util.Arrays;

public class PrimeLargeSieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 10;
        boolean[] isPrime = new boolean[n + 1];

        // Assume all numbers are prime initially
        Arrays.fill(isPrime, true);

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
