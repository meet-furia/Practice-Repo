package kunal_kushwaha.dsa.dsa_practice_1.cycle_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(nums));
        applyCycleSort(nums);
        System.out.println(Arrays.toString(nums));
        List list = findDuplicates(nums);
        System.out.println(list);
    }
    static public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        applyCycleSort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }

    static void applyCycleSort(int[] nums){
        int index = 0;
        while (index < nums.length){
            int correctIndex = nums[index] - 1;
            if (nums[index] == nums[correctIndex]){
                index++;
            }
            else {
                swap(index, correctIndex, nums);
            }
        }
    }

    static void swap(int index, int correctIndex, int[] nums) {
        int temp = nums[index];
        nums[index] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
