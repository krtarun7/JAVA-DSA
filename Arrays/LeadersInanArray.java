package Arrays;

import java.util.*;

public class LeadersInanArray {
    public ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);  // Rightmost element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);  // To maintain left-to-right order
        return leaders;
    }

    public static void main(String[] args) {
        LeadersInanArray obj = new LeadersInanArray();

        int[] arr1 = {16, 17, 4, 3, 5, 2};
        int[] arr2 = {10, 4, 2, 4, 1};
        int[] arr3 = {5, 10, 20, 40};
        System.out.println("Leaders in arr1: " + obj.leaders(arr1)); // Output: [17, 5, 2]
        System.out.println("Leaders in arr2: " + obj.leaders(arr2)); // Output: [10, 4, 4, 1]
        System.out.println("Leaders in arr3: " + obj.leaders(arr3)); // Output: [40]
    }
}
