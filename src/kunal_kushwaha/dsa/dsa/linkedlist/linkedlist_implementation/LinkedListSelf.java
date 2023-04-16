package kunal_kushwaha.dsa.dsa.linkedlist.linkedlist_implementation;

import java.util.LinkedList;

public class LinkedListSelf {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListSelf() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int value, int index) {
        Node temp = head;
        insertAtUsingRecursion(value, index, 0, temp);
    }

    private void insertAtUsingRecursion(int value, int index, int start, Node temp) {
        if (index < 0) {
            System.out.println("Index cannot be negative");
            return;
        }
        if (index > size) {
            System.out.println("Index is greater than size");
            return;
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }
        if (start == index - 1) {
            Node node = new Node(value);
            node.next = temp.next;
            temp.next = node;
            size++;
            return;
        }

        insertAtUsingRecursion(value, index, start + 1, temp.next);
    }
}
