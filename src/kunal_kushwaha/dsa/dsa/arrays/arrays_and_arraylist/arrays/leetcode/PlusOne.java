package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = plusOne(arr);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {9};
        int[] arr4 = plusOne(arr3);
        System.out.println(Arrays.toString(arr4));

    }
    static public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;    }

}
