import java.util.Arrays;
import java.util.Scanner;
public class PairSum {
    public static boolean hasPairWithSum(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int currentSum = A[left] + A[right];
            if (currentSum == target) {
                return true;  
            } else if (currentSum < target) {
                left++; 
            } else {
                right--;  
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        Arrays.sort(A);
        boolean result = hasPairWithSum(A, target);
        System.out.println(result ? "True (found)" : "False (not found)");
        scanner.close();
    }
}