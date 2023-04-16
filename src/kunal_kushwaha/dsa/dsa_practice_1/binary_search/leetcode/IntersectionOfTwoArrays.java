package kunal_kushwaha.dsa.dsa_practice_1.binary_search.leetcode;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }
    static public int[] intersection(int[] nums1, int[] nums2) {
        int[] newArray = new int[1001];
        for (int j : nums1) {
            if (newArray[j] == 0) {
                newArray[j]++;
            }
        }

        int count = 0;
        for (int j : nums2) {
            if (newArray[j] == 1) {
                newArray[j]++;
                count++;
            }
        }

        int[] intersectedArray = new int[count];
        int index = 0;
        for(int i = 0; i < newArray.length; i++) {
            if(newArray[i] == 2) {
                intersectedArray[index] = i;
                index++;
            }
            if (index == count){
                break;
            }
        }
        return intersectedArray;
    }
}
