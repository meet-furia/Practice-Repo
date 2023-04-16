package kunal_kushwaha.rest.patterns.patterns;

public class StarPattern2 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}





















//public class StarPattern2 {
//    public static void main(String[] args) {
//
//    }
//    static void printPattern(int rows){
//        for (int i = 1; i <= rows; i++){
//
//        }
//    }
//}
