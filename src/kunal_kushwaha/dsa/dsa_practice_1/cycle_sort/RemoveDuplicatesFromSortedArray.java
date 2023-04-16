package kunal_kushwaha.dsa.dsa_practice_1.cycle_sort;

public class RemoveDuplicatesFromSortedArray {
    // Cycle sort won't work here because the numbers are starting from 0 or 1 so it won't be possible
    // to find correct index.
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int res1 = removeDuplicates(nums1);
        System.out.println(res1);
    }
    static public int removeDuplicates(int[] nums) {
        int i = 0;
        int index = 0;
        while(i < nums.length) {
            int correctIndex = nums[i];
            if(nums[i] == nums[correctIndex]) {
                i++;
            }
            else {
                swap(nums, i, correctIndex);
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                index = j;
                break;
            }
        }
        return index;
    }

    static public void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
