package Design;

import java.util.Stack;

/**
 * @author Christy Guo
 * @create 2023-04-30 1:35 AM
 */
public class _1381DesignaStackWithIncrementOperation {
    int[] arr;
    Stack<Integer> stack;
    int maxSize;

    public _1381DesignaStackWithIncrementOperation(int maxSize) {
        arr = new int[maxSize];

        stack = new Stack<>();
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if(!isFull()){
            stack.push(x);

        }

    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }else{
            int val = stack.pop();
            int size = stack.size();
            int inc = arr[stack.size()];
            if(size > 0) arr[size-1] += arr[size];
            arr[size] = 0;
            return val+inc;
        }
    }

    public void increment(int k, int val) {
        int increNum = Math.min(k, stack.size())-1;
        if(increNum>= 0){
            arr[increNum] += val;
        }

    }

    private boolean isFull(){
        return maxSize == stack.size();
    }
    private boolean isEmpty(){
        return stack.size() == 0;
    }
}
