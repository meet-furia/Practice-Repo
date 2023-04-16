package kunal_kushwaha.dsa.dsa.linkedlist;

import kunal_kushwaha.dsa.dsa.linkedlist.leetcode.RemoveDuplicatesFromSortedList.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);

    }
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

}
