/*Given an array arr[] of size n the task is to find the sum of the contiguous subaarray with a arr[] with the largest sum.
n=5
A[]={5,-4,-2,6,-1}*/

import java.util.Scanner;

public class LargestSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c_sum=0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            c_sum += arr[i];
            if(c_sum < 0)
            {
                c_sum = 0;
            }
            if(c_sum > max_sum)
            {
                max_sum= c_sum;
            }
        }
        System.out.println(max_sum);
    }
}

