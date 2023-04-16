package kunal_kushwaha.rest.patterns.patterns;

public class StarPattern5 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int number){
        for (int row = 1; row <= number ; row++){
            for (int space = number; space > row; space--){
                System.out.print("  ");
            }

            for (int col1 = row; col1 >= 1; col1--){
                System.out.print(col1 + " ");
            }

            for (int col2 = 2; col2 <= row; col2++){
                System.out.print(col2 + " ");
            }
            System.out.println();
        }
    }
}
