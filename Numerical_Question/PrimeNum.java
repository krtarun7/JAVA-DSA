import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
}
}

