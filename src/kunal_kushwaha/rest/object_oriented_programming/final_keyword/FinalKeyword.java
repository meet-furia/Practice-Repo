package kunal_kushwaha.rest.object_oriented_programming.final_keyword;

public class FinalKeyword {
    public static void main(String[] args) {
        Student meet = new Student("Meet", 5, 86.5f);
        meet.name = "Mahek";
        System.out.println(meet.toString());
    }
}

class Student {
    String name;
    int rollNo;
    final float marks;

    public Student(String name, int rollNo, float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}