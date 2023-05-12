package LinkedList;

import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-11
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _23MergekSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists1(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b)->a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        for(ListNode node: lists){
            if(node != null){
                queue.add(node);
            }
        }

        while(!queue.isEmpty()){
            cur.next = queue.poll(); 
            cur = cur.next;
            if (cur.next!=null){
                queue.add(cur.next); 
            }
        }
        return dummy.next;
    }
}



















