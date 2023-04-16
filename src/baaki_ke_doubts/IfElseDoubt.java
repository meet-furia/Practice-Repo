package baaki_ke_doubts;

public class IfElseDoubt {
    public static void main(String[] args) {
        boolean b = false;
        if (b) {
            System.out.println("B is true");
            b = false;
        }
        else {
            b = true;
        }
        System.out.println(b);
    }
}
