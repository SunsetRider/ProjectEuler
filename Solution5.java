/**
 * Problem 5:
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder.
 *
 * What is the smallest positive number 
 * that is evenly divisible by all of the numbers from 1 to 20?
 *
 * Answer: 232792560
 */


public class Solution5 {
    public static int solution () {
        int result = 1;
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        ArrayList<Integer> resultFactorList = new ArrayList<Integer>();

        for (int i = 2; i <= 20; i++) {
            factorList = getFactors(new ArrayList<Integer>(), i);
            resultFactorList = merge(factorList, resultFactorList);
        }

        // multiple all the factors to get the result
        for (int i = 0; i < resultFactorList.size(); i++) {
            result *= resultFactorList.get(i);
        }
        return result;
    }

    // get all the factors except 1, n need to be an integer larger than 1
    public static ArrayList<Integer> getFactors (ArrayList<Integer> factorList, int n) {
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                factorList.add(i);
                return getFactors(factorList, n / i);
            }
        }

        factorList.add(n);

        return factorList;
    }

    // merge factorList into resultFactorList
    public static ArrayList<Integer> merge (ArrayList<Integer> factorList, ArrayList<Integer> resultFactorList) {
        ArrayList<Integer> temp = new ArrayList<Integer> (resultFactorList);
        for (int i = 0; i < factorList.size(); i++) {
            int factor = factorList.get(i);
            if (temp.contains(factor)) {
                temp.remove(temp.indexOf(factor));
            } else {
                resultFactorList.add(factor);
            }
        }

        return resultFactorList;
    }
}