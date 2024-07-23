import java.util.*;

public class Stack {
    private static final int size = 10;
    private static int[] st = new int[size];
    private static int top = -1;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch, val;
        while (true) {
            System.out.println("\n***Menu******");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Value: ");
                    val = sc.nextInt();
                    push(val);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    disp();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack is Full!!!");
        } else {
            top++;
            st[top] = val;
            System.out.println("Insertion Successful!!!");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!!!");
        } else {
            System.out.println("Deleted: " + st[top]);
            top--;
        }
    }

    public static void disp() {
        if (top == -1) {
            System.out.println("Stack is Empty!!!");
        } else {
            System.out.println("Stack Elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(st[i]);
            }
        }
    }
}
