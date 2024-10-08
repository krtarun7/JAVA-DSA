//Find smallest number using method among three numbers
public class findsmallest {
    static void Smallestfind(int a, int b , int c){
        if(a < b && a < c){
            System.out.println("Smallest number is " + a);
        }
        else {
            if(b < a && b < c){
                System.out.println("Smallest number is " + b);
            }
            else{
                System.out.println("Smallest number is " + c);
            }
        }
    }
    public static void main(String[] args) {
        Smallestfind(25,37,29);
}
}


