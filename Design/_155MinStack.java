package Design;

import java.util.Stack;

/**
 * @author Christy Guo
 * @create 2023-04-30 1:31 AM
 */
public class _155MinStack {
    Stack<int[]> stack;
    public _155MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new int[]{val, val});
        }else{
            int minVal = Math.min(stack.peek()[1], val);
            stack.push(new int[]{val, minVal});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

    public static void main(String[] args) {
        System.out.println("he");
    }
}
