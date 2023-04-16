package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] temp = intersection(nums1, nums2);
        System.out.println(Arrays.toString(temp));
    }

    static public int[] intersection(int[] nums1, int[] nums2) {
        int count = 0;
        int[] temp = new int[1001];
        for (int i = 0; i < nums1.length; i++){
            if (temp[nums1[i]] == 0){
                temp[nums1[i]]++;
                count++;
            }
        }

        int[] array = new int[count];
        int arrayIndex = 0;
        for (int i = 0; i < nums2.length; i++){
            if (temp[nums2[i]] == 1){
                temp[nums2[i]]++;
                array[arrayIndex] = nums2[i];
                arrayIndex++;
            }
        }
        int[] finalArray = new int[arrayIndex];

        for (int i = 0; i < arrayIndex; i++){
            finalArray[i] = array[i];
        }

        System.out.println(arrayIndex);
        return finalArray;
    }

}
