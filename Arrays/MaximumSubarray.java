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
        return sum;
        /*
        if we print the subarray with maximum subarray sum
        then we will replace the retrun statement with this code
        */

        /*
        System.out.println("Maximum Subarray Sum: " + max);
        System.out.print("Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        */
    }


    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(MaxSubarray(arr));
        /*here replace the print statement with call the function like MaximumSubarray(arr);
        and change the type of function from int to void */
    }
}
