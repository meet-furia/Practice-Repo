package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = runningSum(arr1);
        for (int i : arr2){
            System.out.print(i + " ");
        }
    }
    static public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

}
