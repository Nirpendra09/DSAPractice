import java.util.*;

public class LargesNumWithNegPair {
    public static void main(String[] s) {
        int[] arr = { -41, 3, 2, 5, 41 };
        System.out.println(largestNumWithNegPair(arr));
    }

    public static int largestNumWithNegPair(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int curMax = 0;
        for (int a : arr) {
            if (set.contains(a * -1))
                curMax = Math.max(curMax, Math.abs(a));
            else
                set.add(a);
        }
        return curMax;
    }
}
