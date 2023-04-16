package kunal_kushwaha.rest.patterns.patterns_practice;

public class StarPattern1 {
    public static void main(String[] args) {
        printPattern1(10);
        printPattern2(5);
    }
    static void printPattern1(int rows){
        for (int i = 1; i <= rows; i++){
            for (int k = rows; k > i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                if (i <= 2){
                    System.out.print("* ");
                }
                if (i >= 3){
                    if (j == 1 || j == i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void printPattern2(int rows){
        for (int i = 1; i <= rows; i++){
            for (int k = rows; k > i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
