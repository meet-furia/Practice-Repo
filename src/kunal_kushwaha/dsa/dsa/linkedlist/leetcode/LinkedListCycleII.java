package kunal_kushwaha.dsa.dsa.linkedlist.leetcode;


/** Definition for singly-linked list. */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycleII {

    public int getLength(ListNode head) {
        ListNode slow = head;
        int length = 0;
        do {
            slow = slow.next;
            length++;
        }
        while (slow != head);
        return length;
    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                length = getLength(slow);
                break;
            }
        }
        ListNode first = head, second = head;
        while (length != 0) {
            second = slow.next;
            length--;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }

}
