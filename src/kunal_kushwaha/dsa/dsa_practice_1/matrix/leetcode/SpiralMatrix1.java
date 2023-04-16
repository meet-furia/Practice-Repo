package kunal_kushwaha.dsa.dsa_practice_1.matrix.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix1 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List list1 = spiralOrder(matrix1);
        System.out.println(list1);
    }

    static public List<Integer> spiralOrder(int[][] matrix) {
        List list = new ArrayList();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;

        while (true) {
            // Left --> Right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            if (left > right || top > bottom) {
                break;
            }

            // Top --> Bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (left > right || top > bottom) {
                break;
            }

            // Right --> Left
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;

            if (left > right || top > bottom) {
                break;
            }

            // Bottom --> Top
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;

            if (left > right || top > bottom) {
                break;
            }
        }
        return list;
    }
}
