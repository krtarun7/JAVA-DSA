package Conversions;
import java.util.Stack;
import java.util.*;
public class InfixToPostfix {
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
    public static void infixToPostfix(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                res.append(c);
            }
            else if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
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
        System.out.println("Postfix expression: " + res.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();
        infixToPostfix(exp);
        sc.close();
    }
}
