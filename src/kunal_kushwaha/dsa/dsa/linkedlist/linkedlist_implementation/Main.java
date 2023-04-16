package kunal_kushwaha.dsa.dsa.linkedlist.linkedlist_implementation;

public class Main {
    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();
        linkedListSelf.insertFirst(5);
        linkedListSelf.insertFirst(10);
        linkedListSelf.insertFirst(15);

        linkedListSelf.insertLast(0);
        linkedListSelf.display();

        linkedListSelf.insertAt(3, 2);
        linkedListSelf.display();

        LinkedListSelf linkedListSelf1 = new LinkedListSelf();
        linkedListSelf.insertAt(1, 0);

    }
}
