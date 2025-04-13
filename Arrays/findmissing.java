package Arrays;

public class findmissing {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n+1) * (n + 2) / 2;
        for (int i : nums) {
            total -= i;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums={1,2,4,5};
        int result=missingNumber(nums);
        System.out.println("The missing number will be :"+result);

    }
}
