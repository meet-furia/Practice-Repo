package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        List list1 = findDisappearedNumbers(nums1);
        System.out.println(list1.toString());

        int[] nums2 = {1,1};
        List list2 = findDisappearedNumbers(nums2);
        System.out.println(list2.toString());

    }
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        applyCycleSort(nums);
        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i + 1){
                list.add(i + 1);
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
