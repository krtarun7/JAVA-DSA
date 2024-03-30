import java.util.*;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(b>a){
            max=b; 
        }

        if(c>max){
            max=c;
        }
        System.out.println(max);
     }
}
