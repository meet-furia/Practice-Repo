package kunal_kushwaha.dsa.dsa.arrays.sorting.leetcode;

public class HeightChecker {
    public static void main(String[] args) {
        int[] height1 = {1,1,4,2,1,3};
        int count1 = heightChecker(height1);
        System.out.println(count1);

        int[] height2 = {1,2,3,4,5};
        int count2 = heightChecker(height2);
        System.out.println(count2);

    }

    static public int heightChecker(int[] heights) {
        int count = 0;

        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++){
            expected[i] = heights[i];
        }

        for (int i = 0; i < expected.length-1; i++){
            for (int j = i+1; j > 0; j--){
                if (expected[j] < expected[j-1]){
                    swap(expected, j, j-1);
                }
                else {
                    break;
                }
            }
        }

        for (int i = 0; i < expected.length; i++){
            if (expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    static void swap(int[] expected, int index1, int index2) {
        int temp = expected[index1];
        expected[index1] = expected[index2];
        expected[index2] = temp;
    }



}

