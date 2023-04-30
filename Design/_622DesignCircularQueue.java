package Design;

/**
 * @author Christy Guo
 * @create 2023-04-30 1:33 AM
 */
public class _622DesignCircularQueue {
    int[] arr;
    int first;
    int last;
    int size;
    int k;

    public _622DesignCircularQueue(int k) {
        arr = new int[k];
        first = 0;
        last = -1;
        size = 0;
        this.k = k;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else{
            last = (last+1) % k;
            arr[last] = value;
            size++;
            return true;
        }
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else{
            first = (first + 1)% k;
            size--;
            return true;
        }
    }

    public int Front() {
        return isEmpty()? -1: arr[first];
    }
    public int Rear() {
        return isEmpty()? -1: arr[last];
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == k;
    }
}
