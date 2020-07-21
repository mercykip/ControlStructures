import java.util.Scanner;
import java.util.Stack;

public class Task4 {

    public boolean task4(String exp) {

        if (exp.length() % 2 == 1) {
            return false;
        }


        Stack<Character> stack = new Stack();
        for (char c : exp.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (c == ')' || c == '}' || c == ']') {

                if (stack.empty()) {
                    return false;
                }
                Character top = stack.pop();
                if ((top == '(' && c != ')') || (top == '{' && c != '}')
                        || (top == '[' && c != ']')) {
                    return false;
                }
            }
        }

        // expression is balanced only if stack is empty at this point
        return stack.empty();
    }

    public static void main(String[] args) {
        Task4 n = new Task4();
        Scanner nw = new Scanner(System.in);
        System.out.println("enter character");
        String c=nw.next();

        if (n.task4(c)) {
            System.out.println(c);
            System.out.println(true);
        } else {
            System.out.println(c);
            System.out.println(false);
        }
    }
}