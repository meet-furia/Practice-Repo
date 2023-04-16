package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

public class EvenNumbersOfDigits {
    public static void main(String[] args) {
        int[] nums1 = {123, 451, 252, 658, 983};
        int count1 = findNumbers(nums1);
        System.out.println(count1);

        int[] nums2 = {12,345,2,6,7896};
        int count2 = findNumbers(nums2);
        System.out.println(count2);

        int[] nums3 = {555,901,482,1771};
        int count3 = findNumbers(nums3);
        System.out.println(count3);

        int[] nums4 = {-555,-901,-4822,-1772};
        int count4 = findNumbers(nums4);
        System.out.println(count4);


        int n = 1050;
        String s = n + " ";
        System.out.println(s);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        int temp;
        for (int i = 0; i < nums.length; i++){
            temp = nums[i];
            if (even(temp)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = countDigits(num);
        return numberOfDigits % 2 == 0;
    }

    static int countDigits(int num){
        int digits = 0;
        if (num < 0){
            num = num * -1;
        }

        if (num == 0){
            digits = 1;
        }

        while (num > 0){
            num = num/10;
            digits++;
        }
        return digits;
    }

    void convertingToString(){
        int n = 1050;
        String s = n + " ";
        System.out.println(s);
    }
}
