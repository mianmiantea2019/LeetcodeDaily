package LinkedList;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-16
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _203RemoveLinkedListElements {
    public ListNode removeElements0(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
