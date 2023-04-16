package kunal_kushwaha.dsa.dsa.linkedlist.circular_linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertAfterTail(10);
        circularLinkedList.insertAfterTail(20);
        circularLinkedList.insertAfterTail(30);
        circularLinkedList.insertAfterTail(40);
        circularLinkedList.insertAfterTail(50);

        circularLinkedList.display();
    }
}
