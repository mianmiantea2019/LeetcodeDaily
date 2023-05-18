package Queue;

import java.util.Stack;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-18
 * @LastEditors: mianmiantea2019
 * @Description:
 */
//FIFO
public class _232ImplementQueueusingStacks {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;
    public _232ImplementQueueusingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        // If the output stack is empty, transfer elements from the input stack to the output stack
        if (outputStack.isEmpty())
            transferElements();
        return outputStack.pop();
    }

    public int peek() {
        // If the output stack is empty, transfer elements from the input stack to the output stack
        if (outputStack.isEmpty())
            transferElements();
        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    private void transferElements() {
        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }
    }
}
