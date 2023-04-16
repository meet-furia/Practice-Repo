package kunal_kushwaha.dsa.dsa_practice_1.matrix;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int count = 0;
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = count++;
            }
        }
        for (int[] outer : matrix1){
            for (int inner : outer){
                System.out.print(inner + " ");
            }
            System.out.println();
        }

    }
}
