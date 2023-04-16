package kunal_kushwaha.dsa.dsa_practice_2.matrix.linkedlist.linkedlistself;

public class LinkedListSelf {
    public Node head;
    public Node tail;
    int size;

    public LinkedListSelf() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int value, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }

        Node temp = get(size - 2);
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node prev = get(index - 1);
        Node next = prev.next;
        Node newNext = next.next;
        prev.next = newNext;
        size--;
    }

}
