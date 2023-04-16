package kunal_kushwaha.dsa.dsa.linkedlist.leetcode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

class A {
    B b = new B();

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.b);
    }
}
class B {}
