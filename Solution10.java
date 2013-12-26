/**
 * Problem 10:
 * Summation of primes
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 * Answer:
 */
 
public class Solution10 {
    public static int solution () {
        int result = 0;

        for (int i = 2; i < 200000; i++) {
            if (isPrime(i)) {
                result += i;
            }
        }

        return result;
    }

    public static boolean isPrime (int n) {
        for (int i = 2; i <= (int)Math.pow(n, 0.5); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
