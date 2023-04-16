package kunal_kushwaha.dsa.dsa.searching;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        System.out.println(0 % 2 == 0);
        int[] nums1 = {3,1,2,4};
        int[] sap1 = sortArrayByParity(nums1);
        System.out.println(Arrays.toString(sap1));

//        int[] nums2 =
    }
    static public int[] sortArrayByParity(int[] nums) {
        int evenPointer = 0;
        int i = 0;
        while (i < nums.length) {
            if (evenPointer == nums.length) {
                break;
            }

            if (nums[i] % 2 == 0) {
                if (nums[evenPointer] % 2 == 0) {
                    if (evenPointer == i) {
                        evenPointer++;
                        i++;
                    }
                    else {
                        evenPointer++;
                    }
                }
                else {
                    swap(nums, i, evenPointer);
                    i++;
                }
            }
            else {
                i++;
            }
        }
        return nums;
    }

    static public void swap(int[] nums, int i, int evenPointer) {
        int temp = nums[i];
        nums[i] = nums[evenPointer];
        nums[evenPointer] = temp;
    }
}
