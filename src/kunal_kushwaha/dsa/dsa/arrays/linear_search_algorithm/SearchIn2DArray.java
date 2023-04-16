package kunal_kushwaha.dsa.dsa.arrays.linear_search_algorithm;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {{0, 1}, {2, 3}, {4, 5, 6}};

        int target = 6;
        int[] result = searchIn2DArray(arr1, target);
        System.out.println(Arrays.toString(result));

        int[][] arr2 = {
                {98, 56, 47, 152},
                {54, 786, 35, 49},
                {198, 264, 384, 175}
        };
        int min = minIn2DArray(arr2);
        System.out.println(min);


        int[] arr3 = {54, 4, 655, 2, 4, 65, 644, 6};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));


        Object ob = new String("Hi");
        String str = ob.toString();
        System.out.println(ob);
        System.out.println(str);
    }


    static int[] searchIn2DArray(int[][] arr, int target){
        int[] arrayAnswer = {-1, -1};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return arrayAnswer;
    }

    static int minIn2DArray(int[][] arr){
        int min = arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

}
