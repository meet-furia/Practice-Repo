package kunal_kushwaha.dsa.dsa.linkedlist.linkedlist;

import java.util.LinkedList;

public class Basics {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add("Meet");
        list.add(7);
        System.out.println(list.get(2));
        list.push(10);
        System.out.println(list);
    }

}
