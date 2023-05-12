package LinkedList;

import java.util.List;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-11
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _24SwapNodesinPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode res = new ListNode();
        res.next = head;
        ListNode cur = res;
        ListNode next = null;
        ListNode temp = null;

        while (cur.next != null && cur.next.next != null){
            next = head.next;
            temp = next.next;
            cur.next = next;
            next.next = head;
            head.next = temp;
            cur = head;
            head = head.next;
        }
        return res.next;
    }
}
