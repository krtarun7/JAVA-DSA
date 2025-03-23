package Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Take input for each element of the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
