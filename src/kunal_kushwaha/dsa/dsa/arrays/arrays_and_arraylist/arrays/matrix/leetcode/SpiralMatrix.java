package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.matrix.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        List list = spiralOrder(matrix1);
        System.out.println(list.toString());
    }

    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (true){
            for (int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            if (top > bottom || left > right) {
                break;
            }

            for (int j = top; j <= bottom ; j++){
                list.add(matrix[j][right]);
            }
            right--;

            if (top > bottom || left > right){
                break;
            }

            for (int k = right; k >= left; k--){
                list.add(matrix[bottom][k]);
            }
            bottom--;

            if (top > bottom || left > right){
                break;
            }

            for (int l = bottom; l >= top; l--){
                list.add(matrix[l][left]);
            }
            left++;

            if (top > bottom || left > right){
                break;
            }
        }
        return list;
    }

}
