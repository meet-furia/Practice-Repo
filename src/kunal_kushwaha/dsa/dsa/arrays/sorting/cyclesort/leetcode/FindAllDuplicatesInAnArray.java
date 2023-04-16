package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        applyCycleSort(nums);
        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i + 1){
                list.add(nums[i]);
            }
        }
        return list;

    }

    static public void applyCycleSort(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correction = nums[i] - 1;
            if (nums[i] == nums[correction]){
                i++;
            }
            else {
                swap(nums, i, correction);
            }
        }
    }
    static public void swap(int[] array, int i, int correction){
        int temp = array[i];
        array[i] = array[correction];
        array[correction] = temp;
    }

}
