import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.print(" "+f);
    }
}
