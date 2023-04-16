package kunal_kushwaha.rest.object_oriented_programming.oop.oop1.classes;

import java.util.Arrays;

class ClassDemo {
    Student student = new Student();

    public static void main(String[] args) {
        Student meet = new Student();
        System.out.println(meet.marks);
        System.out.println(Arrays.toString(meet.marks));
    }
}
public class Student {
    int[] marks = new int[5];
}
