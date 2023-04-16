package kunal_kushwaha.dsa.dsa.linkedlist.leetcode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(3);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode listNode = new ListNode(1, listNode1);

//        deleteDuplicates(listNode);

        deleteDuplicatesByKK(listNode);

        ListNode head = listNode;
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

    static public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode headTemp = head;
        while (headTemp != null) {
            if (headTemp.val != temp.val) {
                temp.next = headTemp;
                temp = headTemp;
            }
            headTemp = headTemp.next;
        }
        if (temp != null) {
            temp.next = null;
        }
        return head;
    }


    static public ListNode deleteDuplicatesByKK(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode head = node;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        return head;
    }



        static public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
