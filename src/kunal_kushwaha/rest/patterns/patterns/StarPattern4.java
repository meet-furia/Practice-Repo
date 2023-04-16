package kunal_kushwaha.rest.patterns.patterns;

public class StarPattern4 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int number){
        for (int row = 0; row < number; row++){
            for (int col = row; col < number; col++){
                System.out.print("*");
            }

            for (int space = 1; space <= row * 2; space++){
                System.out.print(" ");
            }

            for (int col = row; col < number; col++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int row = number - 1; row >= 0; row--){
            for (int col = number - 1; col >= row; col--){
                System.out.print("*");
            }

            for (int space = 1; space <= row * 2; space++){
                System.out.print(" ");
            }

            for (int col = number - 1; col >= row; col--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


//  18.   **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
