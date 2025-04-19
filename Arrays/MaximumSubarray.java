package Arrays;
import java.util.*;

public class MaximumSubarray {
    static int MaxSubarray(int[] arr) {
        int start = 0, ansStart = -1, ansEnd = -1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0)
                start = i;
            sum += arr[i];
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(MaxSubarray(arr));
    }
}
