package LinkedList;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-15
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _142LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
