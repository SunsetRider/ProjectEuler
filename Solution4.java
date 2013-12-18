/**
 * Problem 4:
 * Largest palindrome product
 * A palindromic number reads the same both ways. The largest palindrome made from  * the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Answer: 906609
 */


public class Solution4 {
    public static boolean isPalindrome(int x) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.

        if (x < 0)
            return false;

        int rev = 0;
        int num = x;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev == x;
    }

    public static int solution() {
        int result = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int tempResult = i * j;
                if (isPalindrome(tempResult) && tempResult > result) {
                    result = tempResult;
                }
            }
        }

        return result;
    }
}
