public class Solution5 {
    public static int solution () {
        int result = 0;

        return result;
    }

    public static HashSet<Integer> getFractors (int n) {
        HashSet<Integer> fractorSet = new HashSet<Integer>();
        for (int i = 2; i <= n; i++) {
            if (n%i == 0) {
                fractorSet.add(i);
            }
        }

        return fractorSet;
    }
}
