package kunal_kushwaha.rest.patterns.patterns;

public class StarPattern1 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int number){
        for (int i = number; i >= 1; i--){
            for (int k = number; k > i; k--){
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= number; i++){
            for (int k = number; k > i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
