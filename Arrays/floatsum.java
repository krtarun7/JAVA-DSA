package Arrays;

public class floatsum {
    public static void main(String[] args) {
        float[] num={1.3f,23f,2.1f};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum +=num[i];
        }
        System.out.println(sum);
    }
}
