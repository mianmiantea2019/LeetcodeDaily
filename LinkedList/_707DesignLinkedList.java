package LinkedList;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-16
 * @LastEditors: mianmiantea2019
 * @Description:
 */



public class _707DesignLinkedList {
    private ListNode head;
    private int size;
    public _707DesignLinkedList() {
        head = null;
        size = 0;
    }

  public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        ListNode iterator = head;
        for (int i = 0; i < index; i++) { 
            iterator = iterator.next;
        }
        return iterator.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) { 
            head = newNode;
        } else {
            ListNode curr = head;
            while (curr.next != null) { 
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

  public void addAtIndex(int index, int val) {
        // valid index
        if (index < 0 || index > size)
            return;
        if(index == 0) {
            addAtHead(val);
        } else if (index == size -1 ) {
            addAtTail(val);
        } else {
            ListNode newNode = new ListNode(val);
            ListNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next; 
            }
            newNode.next = curr.next; 
            curr.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        // valid index
        if (index < 0 || index >= size)
            return;
        if(index == 0 ) {
            head = head.next;
        } else {
            ListNode curr = head;
            for (int i = 0; i < index - 1 ; i++) {
                curr = curr.next;  
            }
            curr.next = curr.next.next;
        }
            size--;
    }
}
