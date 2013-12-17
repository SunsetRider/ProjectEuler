/**
 * Probelm 3: Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */

 public class Solution3 {
    public static String solution () {
        int upBound = 800000;
        BigInteger n = new BigInteger("600851475143");
        for (int i = 3; i < upBound; i++) {
            int flag = 0;
            for (int j = 2; j < (int)Math.pow(i, 0.5)+2; j++) {
                if (i%j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                if (n.mod(new BigInteger(i+"")).toString().equals("0")) {
                    return (n.divide(new BigInteger(i+"")).toString());
                }
            }
        }

        return "";
    }
}
