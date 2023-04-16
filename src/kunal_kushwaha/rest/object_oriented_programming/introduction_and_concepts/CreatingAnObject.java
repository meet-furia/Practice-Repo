package kunal_kushwaha.rest.object_oriented_programming.introduction_and_concepts;

import java.util.Arrays;

public class CreatingAnObject {
    public static void main(String[] args) {
        Student meet = new Student();
        meet.name = "Meet";
        meet.rollNo = 7;
        meet.marks = 86.5f;

        Student manoj = new Student();
        System.out.println(manoj.marks);

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));

        System.out.println("Hi ");

        System.out.println();

        Student student1 = new Student();


    }
}
class Student {
    String name;
    int rollNo;
    float marks;

    public Student(){}
    public Student(String name, int rollNo, float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}