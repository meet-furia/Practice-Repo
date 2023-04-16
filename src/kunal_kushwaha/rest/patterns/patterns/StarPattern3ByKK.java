package kunal_kushwaha.rest.patterns.patterns;

public class StarPattern3ByKK {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int number) {
        for (int rows = 1; rows < number * 2; rows++) {
            int colsInRow = rows > number ? 2 * number - rows : rows;
            for (int col = 1; col <= colsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

