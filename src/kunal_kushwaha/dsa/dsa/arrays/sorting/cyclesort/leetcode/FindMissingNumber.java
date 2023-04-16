package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort.leetcode;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {4, 0, 2, 1};
        int mn1 = missingNumber(arr1);
        System.out.println(mn1);

        int[] arr2 = {0, 1};
        int mn2 = missingNumber(arr2);
        System.out.println(mn2);

    }
    static int[] applyCycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (correct > arr.length - 1){
                i++;
            }
            else if (arr[correct] == arr[i]){
                i++;
            }
            else {
                swap(arr, i, correct);
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    static public int missingNumber(int[] nums) {
        applyCycleSort(nums);
        int missingNumber = nums.length;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i){
                return i;
            }
        }
        return missingNumber;
    }

}
