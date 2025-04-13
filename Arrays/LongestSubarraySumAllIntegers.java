package Arrays;
import java.util.*;

public class LongestSubarraySumAllIntegers {
    public static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                int prevIndex = map.get(sum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            // Store first occurrence of the sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums={1, -1, 5, -2, 3};
        int k=3;
        System.out.println(longestSubarray(nums,k));
    }
}
