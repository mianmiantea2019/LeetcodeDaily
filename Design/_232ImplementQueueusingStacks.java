package Design;

import java.util.Stack;

/**
 * @author Christy Guo
 * @create 2023-04-30 1:33 AM
 */
public class _232ImplementQueueusingStacks {
    Stack<Integer> stack;
    Stack<Integer> queue;

    /**
     * Fellow up O(1) solution
     */
    public _232ImplementQueueusingStacks() {
        stack = new Stack<>();
        queue = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        peek();
        return queue.pop();
    }

    public int peek() {
        if(queue.isEmpty()){
            while(!stack.isEmpty()){
                queue.push(stack.pop());
            }
        }
        return queue.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && queue.isEmpty();
    }
}
