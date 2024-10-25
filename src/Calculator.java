import java.util.Stack;

public class Calculator {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                System.out.println(currentChar - '0');
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (operation == '-') {
                    stack.push(-currentNumber);
                } else if (operation == '+') {
                    stack.push(currentNumber);
                } else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }

        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("3+2*2"));   // Output: 7
//        System.out.println(calculate(" 3/2 "));   // Output: 1
//        System.out.println(calculate(" 3+5 / 2 "));
    }


}
