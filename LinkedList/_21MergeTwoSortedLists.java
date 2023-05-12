package LinkedList;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-11
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _21_MergeTwoSortedLists {
    public static class ListNode {
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

    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        int val1 = list1.val;
        int val2 = list2.val;

        if (val1 <= val2) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;

        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

}
