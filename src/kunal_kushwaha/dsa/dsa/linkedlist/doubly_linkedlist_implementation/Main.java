package kunal_kushwaha.dsa.dsa.linkedlist.doubly_linkedlist_implementation;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(20);
        doublyLinkedList.insertFirst(15);
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertFirst(5);

        doublyLinkedList.display();
        doublyLinkedList.displayRev();

        doublyLinkedList.insertLast(25);
        doublyLinkedList.display();

        doublyLinkedList.insertAfter(2, 22);
        doublyLinkedList.display();
        doublyLinkedList.displayRev();
    }
}
