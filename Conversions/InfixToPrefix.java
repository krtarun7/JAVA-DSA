package Conversions;
import java.util.Stack;
import java.util.*;
public class InfixToPrefix {
    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    static char associativity(char c) {
        if (c == '^')
            return 'R'; 
        return 'L'; 
    }
    public static void infixToPrefix(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        StringBuilder reversed = new StringBuilder(s).reverse();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                res.append(c);
            }
            else if (c == ')') {
                st.push(c);
            }
            else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    res.append(st.pop());
                }
                st.pop(); 
            }
            else {
                while (!st.isEmpty() && (prec(c) < prec(st.peek()) || (prec(c) == prec(st.peek()) && associativity(c) == 'L'))) {
                    res.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        String prefix = res.reverse().toString();
        System.out.println("Prefix expression: " + prefix);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();
        infixToPrefix(exp);
        sc.close();
    }
}