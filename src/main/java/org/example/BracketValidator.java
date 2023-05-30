package org.example;
import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        String[] samples = {
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[]}",
                "{[}]()",
        };

        for (String s : samples) {
            boolean isValid = isValid(s);
            System.out.println(s + " - " + isValid);
        }
    }

    private static boolean isOpenBracket(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    private static boolean isCloseBracket(char bracket) {
        return bracket == ')' || bracket == ']' || bracket == '}';
    }

    private static boolean isMatchPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (isOpenBracket(bracket)) {
                stack.push(bracket);
            } else if (isCloseBracket(bracket) && (stack.isEmpty() || !isMatchPair(stack.pop(), bracket))) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
