package java_from_start.introduction;

public class JavaMainMethod {
    char c;
    public static void main(int[] args) {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        JavaMainMethod jmm = new JavaMainMethod();
        System.out.println(jmm.c);
    }
}
