package kunal_kushwaha.rest.strings;

public class Strings1 {
    public static void main(String[] args) {
        String s1 = new String("Meet");
        System.out.println(s1);

        String s2 = new String("Meet");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        int i = 50;
        System.out.println(i + "2");

        System.out.println("50" + "50");

        System.out.println("2" + i);

        Integer i1 = 52;
        Integer i2 = 58;
        System.out.println(i1 + i2);
        System.out.println(new Integer(50) + new Integer(50));

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1 + c2);
    }
}
