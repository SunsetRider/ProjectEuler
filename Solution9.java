/**
 * Problem 9:
 * Special Pythagorean triplet
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Answer: 31875000
 */

public class Solution9 {
    public static int solution () {
        for (int a = 1; a < 1000; a++) {
            for (int b = a+1; b < 1000; b++) {
                for (int c = b+1; c < 1000; c++) {
                    if ((a*a + b*b == c*c) && a + b + c == 1000) {
                        return a*b*c;
                    }
                }
            }
        }

        return 0;
    }
}
