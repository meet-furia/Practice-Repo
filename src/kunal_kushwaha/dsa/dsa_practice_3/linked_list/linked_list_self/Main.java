package kunal_kushwaha.dsa.dsa_practice_3.linked_list.linked_list_self;

public class Main {
    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();
        linkedListSelf.insertFirst(40);
        linkedListSelf.insertLast(50);
        linkedListSelf.insertFirst(20);
        linkedListSelf.insertFirst(10);
        linkedListSelf.insertAt(30, 2);

        linkedListSelf.display();


        linkedListSelf.deleteFirst();
        linkedListSelf.deleteLast();
        linkedListSelf.deleteIndex(2);

        linkedListSelf.display();

        System.out.println(linkedListSelf.find(40));
    }
}
