package kunal_kushwaha.rest.object_oriented_programming.static_keyword;

public class Human {
    String name;
    int age;
    static int population;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        Human.population += 1;
    }

    void printDetails(){
        System.out.println("Name : " + name + '\n' + "Age : " + age + '\n' + "Population : " + population);
    }
}
