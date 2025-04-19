package Arrays;
import java.util.*;
public class RearrangeArray {
    public static int[] rearrangeArray(int[] arr){
        int[] result=new int[arr.length];
        int posIndex=0,negIndex=1;
        for(int num: arr){
            if(num > 0){
                result[posIndex]=num;
                posIndex+=2;
            }
            else{
                result[negIndex]=num;
                negIndex+=2;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int[] result=rearrangeArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
