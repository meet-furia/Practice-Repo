package kunal_kushwaha.rest.object_oriented_programming.inheritance;

public class ChildClass extends ParentClass{
    int weight;
    public ChildClass(int age, int weight){
        super(age);
        this.weight = weight;
    }
    void displayInfo(){
        System.out.println("Age : " + age + '\n' + "Weight : " + weight);
    }
}
