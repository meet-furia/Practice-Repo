package kunal_kushwaha.rest.intro_to_programming;

public class AssigningArrayToAnotherArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = a;
        a[0] = 2;
        int[] e = {5, 6, 7, 8};
        b = e;

        int c = 20;
        int d = c;
        c = 30;

        System.out.println(c);
        System.out.println(d);

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }

    }
}
