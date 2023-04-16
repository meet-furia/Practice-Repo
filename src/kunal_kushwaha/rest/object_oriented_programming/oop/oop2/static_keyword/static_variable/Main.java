package kunal_kushwaha.rest.object_oriented_programming.oop.oop2.static_keyword.static_variable;

public class Main {
    public static void main(String[] args) {

        System.out.println(Human.population);
        Human human = new Human("Meet", 23);
        System.out.println(human.name);
        System.out.println(human.population);

        Human human1 = new Human("Kk", 25);
        System.out.println(human1.name);
        System.out.println(human1.population);

    }
}
class Human {
    String name;
    int age;
    static int population;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        Human.population += 1;
    }
}