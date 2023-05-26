package Stack;

import java.util.Stack;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-25
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result;
                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else { // token.equals("/")
                    result = a / b;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

  private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
