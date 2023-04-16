package kunal_kushwaha.dsa.dsa_practice_1.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums1 = {125, 25, 65, 78, 48, 65, 65, 12, 5, 3, 1};
        System.out.println(Arrays.toString(nums1));
        bubbleSort(nums1);
        System.out.println(Arrays.toString(nums1));


        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(nums2));
        bubbleSort(nums2);
        System.out.println(Arrays.toString(nums2));

    }

    static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            boolean flag = false;
            for (int j = 0; j < nums.length - 1 -i; j++){
                if (nums[j] > nums[j + 1]){
                    swap(nums, j, j+1);
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
    static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
