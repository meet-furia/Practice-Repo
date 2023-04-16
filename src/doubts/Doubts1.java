package doubts;

import java.util.Arrays;

public class Doubts1 {
    Integer i1 = 10;
    Integer i2 = i1;
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = i1;
        i1 = 20;
        System.out.println(i1);
        System.out.println(i2);

        Doubts1 doubts1 = new Doubts1();
        doubts1.i2 = 20;
        System.out.println(doubts1.i1);
        System.out.println(doubts1.i2);

        int[] a1 = {10, 20, 30};
        int[] a2 = a1;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        a1[2] = 40;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));


        StringBuilder s1 = new StringBuilder("Meet");
        StringBuilder s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

    }
}
