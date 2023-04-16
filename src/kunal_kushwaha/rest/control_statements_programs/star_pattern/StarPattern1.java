package kunal_kushwaha.rest.control_statements_programs.star_pattern;

public class StarPattern1 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int number){
        for (int i = 1; i <= number; i++){
            for (int j = i; j < number; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++){
                if (k == 1 || k == ((i * 2) - 1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
