package Stack;

import java.util.Stack;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-25
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _224BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();  // Stack to store intermediate results
        int operand = 0;  // Current number being processed
        int result = 0;  // Final result
        int sign = 1;  // Sign of the current number

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                operand = operand * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * operand;
                operand = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * operand;
                operand = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * operand;
                operand = 0;
                result *= stack.pop();  // Previous sign
                result += stack.pop();  // Previous result
            } else if (c == ' ') {
                // Ignore any spaces in the string
                continue;
            }
        }

        result += sign * operand;
        return result;
        }
    }
}
