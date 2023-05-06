
package DFS;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-06 12:42 AM
 * @LastEditors: mianmiantea2019
 * @Description:
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class removeNthFromEnd {
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode fastIndex = dummyNode;
        ListNode slowIndex = dummyNode;

        for (int i = 0; i < n; i++) {
            fastIndex = fastIndex.next;
        }

        while (fastIndex.next != null) { 
            fastIndex = fastIndex.next;
            slowIndex = slowIndex.next;
        }

        slowIndex.next = slowIndex.next.next;
        return dummyNode.next;
    }
}
