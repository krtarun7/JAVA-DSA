//Given an expression string .write a program to find whether a given string has balanced parenthesis or not //
import java.util.Stack;

public class BalancedBrackets {
    public static boolean areBracketsBalanced(String expr) {
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '[') {
                temp.push(expr.charAt(i));
            } else if (expr.charAt(i) == ')' || expr.charAt(i) == '}' || expr.charAt(i) == ']') {
                if (temp.isEmpty()) {
                    return false;
                }
                char top = temp.pop();
                if ((top == '(' && expr.charAt(i) != ')') ||
                        (top == '{' && expr.charAt(i) != '}') ||
                        (top == '[' && expr.charAt(i) != ']')) {
                    return false;
                }
            }
        }
        return temp.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{()}[]";
        if (areBracketsBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}