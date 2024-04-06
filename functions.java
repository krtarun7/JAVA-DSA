import java.util.Scanner;

public class functions {
    public static void main(String[] args) { 
        int ans=sum();
        System.out.println(ans); 
    }
    static int sum(){
        System.out.print("Enter number 1 :");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.print("Enter number 2 :");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;
    

    }
}
