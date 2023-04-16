package takeuforward.practice.arrays_and_matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(matrix1);
    }

    static public void setZeroes(int[][] matrix) {
        List listOfI = new ArrayList();
        List listOfJ = new ArrayList();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!listOfI.contains(i)) {
                        listOfI.add(i);
                    }
                    if (!listOfJ.contains(j)) {
                        listOfJ.add(j);
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (listOfI.contains(i) || listOfJ.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
