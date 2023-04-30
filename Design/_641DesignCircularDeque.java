package Design;

/**
 * @author Christy Guo
 * @create 2023-04-30 1:34 AM
 */
public class _641DesignCircularDeque {
    int[] arr;
    int k;
    int size;
    int front;
    int rear;
    public _641DesignCircularDeque(int k) {
        arr = new int[k];
        size = 0;
        front = 0;
        rear = -1;
        this.k = k;
    }

    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }else{
            if(front == 0){
                front = k;
            }
            front--;
            arr[front] = value;
            size++;
            if(size == 1) rear = front;
            return true;
        }
    }
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }else{
            rear = (rear+1)%k;
            arr[rear] = value;
            size++;
            return true;
        }
    }


    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }else{
            front = (front+1)%k;
            // if(size == 1){
            //     rear = front;
            // }
            size--;
            return true;
        }
    }
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }else{
            if(rear == 0){
                rear = k;
            }
            rear = (rear-1)%k;
            size--;
            return true;
        }
    }

    public int getFront() {
        return isEmpty()?-1:arr[front];
    }

    public int getRear() {
        return isEmpty()?-1:arr[rear];
    }

    public boolean isEmpty() {
        return size ==0;
    }

    public boolean isFull() {
        return size == k;
    }
}
