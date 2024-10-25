import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class MakeValidString {

    public static String minRemoveToMakeValid(String s) {

        // Convert string to char array to modify it
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        // Identify indices of invalid parentheses
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else if (chars[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    chars[i] = '*'; // Mark invalid closing parenthesis
                }
            }
        }

        // Mark remaining unmatched opening parentheses
        while (!stack.isEmpty()) {
            chars[stack.pop()] = '*';
        }

        // Construct the result string ignoring the marked characters
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c != '*') {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("()))((("));
    }
}
