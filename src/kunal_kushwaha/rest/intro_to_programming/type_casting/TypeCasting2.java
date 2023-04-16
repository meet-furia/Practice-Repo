package kunal_kushwaha.rest.intro_to_programming.type_casting;

import java.util.Arrays;

public class TypeCasting2 {
    public static void main(String[] args) {
        char c1 = 65500;
        System.out.println(c1);

        char c2 = (char) 70000;
        System.out.println(c2);

        int[] a = {0,1,2,3};
        int[] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0] = 99;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        int a1 = 10;
        int b1 = a1;

        System.out.println(a1);
        System.out.println(b1);

        a1 = 99;
        System.out.println(a1);
        System.out.println(b1);
    }
}
