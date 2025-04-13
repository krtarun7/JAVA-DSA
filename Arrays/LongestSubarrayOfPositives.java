package Arrays;

import java.util.HashMap;

public class LongestSubarrayOfPositives {
    public static int longestSubarray(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0,sum=0, maxlen=0;
        for(int end=0;end<arr.length;end++){
            sum+=arr[end];
            //shrink window while the sum is too long
            while(sum > k){
                sum -=arr[start];
                start++;
            }
            //check if current window is valid
            if(sum == k){
                maxlen=Math.max(maxlen,end-start+1);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,2,5};
        int k=37;
        System.out.println(longestSubarray(arr,k));
    }
}
