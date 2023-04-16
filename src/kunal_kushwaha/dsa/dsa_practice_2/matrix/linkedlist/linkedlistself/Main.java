package kunal_kushwaha.dsa.dsa_practice_2.matrix.linkedlist.linkedlistself;

public class Main {
    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();
        linkedListSelf.insertFirst(10);
        linkedListSelf.insertFirst(20);
        linkedListSelf.insertLast(30);
        linkedListSelf.insertLast(40);
        linkedListSelf.insertAt(50, 2);
        linkedListSelf.insertAt(60, 5);

        linkedListSelf.display();

        linkedListSelf.deleteFirst();

        linkedListSelf.display();

        linkedListSelf.deleteLast();

        linkedListSelf.display();

        linkedListSelf.deleteAtIndex(2);

        linkedListSelf.display();
    }
}
