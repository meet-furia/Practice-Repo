package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

public class NumberSmallerThanCurrent {
    public static void main(String[] args) {
        int[] arr1 = {8,1,2,2,3};
        int[] num1 = smallerNumbersThanCurrent(arr1);
        System.out.println();
        for (int num : num1){
            System.out.print(num + " ");
        }

        int[] arr2 = {6,5,4,8};
        int[] num2 = smallerNumbersThanCurrent(arr2);
        System.out.println();
        for (int num : num2){
            System.out.print(num + " ");
        }

        int[] arr3 = {7,7,7,7};
        int[] num3 = smallerNumbersThanCurrent(arr3);
        System.out.println();
        for (int num : num3){
            System.out.print(num + " ");
        }


        int[] arr4 = {7,7,7,7};
        int[] num4 = smallerNumbersThanCurrentNewMethod(arr4);
        System.out.println();
        for (int num : num4){
            System.out.print(num + " ");
        }

    }
    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            newNums[i] = count;
        }
        return newNums;
    }


    static public int[] smallerNumbersThanCurrentNewMethod(int[] nums) {
        int[] resNums = new int[101];
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            resNums[nums[i]]++;
        }

        for (int i = 1; i < resNums.length; i++){
            resNums[i] += resNums[i - 1];
        }

        for (int i = 0; i < nums.length; i++){
            newNums[i] = resNums[nums[i]];
        }
        return newNums;
    }
    }

