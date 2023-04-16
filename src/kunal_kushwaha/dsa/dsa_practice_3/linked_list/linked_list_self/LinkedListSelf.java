package kunal_kushwaha.dsa.dsa_practice_3.linked_list.linked_list_self;

public class LinkedListSelf {
    public Node head;
    public Node tail;
    public int size;

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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }

        Node secondLast = get(size - 2);
        secondLast.next = null;
        tail = secondLast;
        size--;
    }

    public void deleteIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size) {
            deleteLast();
            return;
        }

        Node temp = get(index - 2);
        temp.next = temp.next.next;
        size--;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
