import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int rem;
        int sum=0;
        int num=n;
        while(n>0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n/=10;
        }
        if(num==sum){
            System.out.println("Armstrong number");

        }
        else{
            System.out.println("not a armstrong number");
        }
    }
    
}
