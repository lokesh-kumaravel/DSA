package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSquareStreak {
    public static void LongestSquarestreak(String[] args) {
        int[] nums = {1, 4, 9, 16, 25, 36};
        System.out.println(longestSquareStreak(nums));
    }

    public static int longestSquareStreak(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.sort(nums);
        int res = -1;

        for (int num : nums) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num && mp.containsKey(sqrt)) {
                mp.put(num, mp.get(sqrt) + 1);
                res = Math.max(res, mp.get(num));
            } else {
                mp.put(num, 1);
            }
        }
        return res;
    }
}
