package kunal_kushwaha.dsa.dsa.linkedlist.circular_linkedlist.implementation;

import java.awt.image.ShortLookupTable;

public class CircularLinkedList {

    public Node head;
    public Node tail;
    public int size;

    private class Node {
        private Node next;
        private int value;
        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
    public void insertAfterTail(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (node != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            while (node != head);
        }
        System.out.println("End");
    }

    public void delete(int value) {

    }
}
