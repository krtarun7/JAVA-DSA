package Array;
import java.util.*;
public class ArraySearch {
    public static void main(String[] args) {
        // Sample array
        Scanner sc=new Scanner(System.in);
        int[] array = {2, 4, 6, 8, 10};
        
        // Element to search for
        System.out.print("Enter a element to find in array : ");
        int element = sc.nextInt();
        
        // Flag to indicate if element is found
        boolean found = false;
        
        // Iterate through the array to find the element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                found = true;
                break;
            }
        }
        
        // Print result
        if (found) {
            System.out.println("Element " + element + " found in the array.");
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }
    }
}
