package kunal_kushwaha.rest.control_statements_programs.star_pattern;

public class StarPattern2 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1;  j <= rows; j++){

                if (i == 1 || i == rows){
                    System.out.print(" * ");
                }
                else {
                    if (j == 1 || j == rows){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
