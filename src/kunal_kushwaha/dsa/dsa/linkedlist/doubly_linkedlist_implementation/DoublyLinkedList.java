package kunal_kushwaha.dsa.dsa.linkedlist.doubly_linkedlist_implementation;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = head;
        }

    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        tail = node;
    }


    public void insertAfter(int index, int value) {
        Node node = new Node(value);
        Node indexNode = get(index);
        node.next = indexNode.next;
        node.prev = indexNode;
        indexNode.next.prev = node;
        indexNode.next = node;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void displayRev() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.println("Start");
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
