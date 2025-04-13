package Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int start = 0;
        int end = num.length - 1;

        // Reverse logic using while loop
        while (start < end) {
            // Swap
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }

        // Print reversed array
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
