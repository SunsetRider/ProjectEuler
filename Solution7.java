/**
 * Problem 7:
 * 10001st prime
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * Answer: 104743
 */

public class Solution7 {
    public static int solution () {
        int primeAccount = 0;
        int i = 2;
        while (primeAccount < 10001) {
            if (isPrime(i++)) {
                primeAccount++;
            }
        }
        return --i;
    }

    public static boolean isPrime (int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < Math.pow(n, 0.5)+1; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
