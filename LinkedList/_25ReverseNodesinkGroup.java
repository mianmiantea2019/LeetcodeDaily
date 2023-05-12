package LinkedList;

import java.util.List;
/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-11
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _25ReverseNodesinkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while(cur != null && count < k){
            cur = cur.next;
            count++;
        }
        if(count == k){
            cur = reverseKGroup(cur, k);
            while(count > 0){
                ListNode n = head.next;
                head.next = cur;
                cur = head;
                head = n;
                count--;
            }
            head = cur;
        }
        return head;
    }
}
