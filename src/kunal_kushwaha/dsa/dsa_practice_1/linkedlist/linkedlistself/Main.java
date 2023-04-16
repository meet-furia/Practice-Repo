package kunal_kushwaha.dsa.dsa_practice_1.linkedlist.linkedlistself;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();
        linkedListSelf.insertFirst(10);
        linkedListSelf.insertFirst(20);
        linkedListSelf.insertFirst(30);

        linkedListSelf.insertLast(40);
        linkedListSelf.insertLast(50);

        linkedListSelf.insertAt(80, 3);

        linkedListSelf.display();

        linkedListSelf.insertAt(100, 10);

    }

}
