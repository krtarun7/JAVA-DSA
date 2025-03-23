import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int rem;
        int rev=0;
        int num=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if (num==rev){
            System.out.println("Palindrome number");

        }else{
            System.out.println("not a palindrome number");
        }
    }
    
}
