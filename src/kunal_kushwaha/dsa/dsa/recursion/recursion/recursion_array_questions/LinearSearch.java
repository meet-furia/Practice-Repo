package kunal_kushwaha.dsa.dsa.recursion.recursion.recursion_array_questions;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums1 = {10, 12, 14, 78, 99, 120};
        int target1 = 78;
        int res1 = linearSearchWithRecursion(nums1, target1, 0);
        System.out.println(res1);

        int[] nums2 = {10, 12, 14, 78, 99, 120};
        int target2 = 120;
        int res2 = linearSearchWithRecursion(nums2, target2, 0);
        System.out.println(res2);

        int[] nums3 = {10, 12, 120, 78, 99, 120};
        int target3 = 120;
        List<Integer> list3 = new ArrayList<>();
        returnAllIndexesWithRecursion(nums3, target3, list3, 0);
        System.out.println(list3);

        int[] nums4 = {120, 10, 12, 120, 78, 99, 120};
        int target4 = 120;
        List<Integer> list4 = returnAllIndexesWithRecursionWithoutParams(nums4, target4, 0);
        System.out.println(list4);

        int[] nums5 = {120, 10, 12, 120, 78, 99, 120};
        int target5 = 120;
        List<Integer> list5 = returnAllIndexesWithRecursionWithoutParamsKKMethod(nums5, target4, 0);
        System.out.println(list5);

    }
    static int linearSearchWithRecursion(int[] nums, int target, int start){
        if (start == nums.length){
            return -1;
        }
        if (nums[start] == target){
            return start;
        }
        return linearSearchWithRecursion(nums, target, ++start);
    }

    static List<Integer> returnAllIndexesWithRecursion(int[] nums, int target, List<Integer> list, int start){
        if (start == nums.length){
            return list;
        }
        if (nums[start] == target){
            list.add(start);
        }
        return returnAllIndexesWithRecursion(nums, target, list, ++start);
    }


    static ArrayList<Integer> returnAllIndexesWithRecursionWithoutParams(int[] nums, int target, int start){
        ArrayList<Integer> list = new ArrayList<>();
        if (start == nums.length){
            return list;
        }
        if (nums[start] == target){
            list.add(start);
        }
//        return returnAllIndexesWithRecursionWithoutParams(nums, target, ++start);
        ArrayList<Integer> answerFromBelowCalls = returnAllIndexesWithRecursionWithoutParams(nums, target, start+1);
        if (!list.isEmpty()){
            answerFromBelowCalls.add(start);
        }
        return answerFromBelowCalls;
    }

    static ArrayList<Integer> returnAllIndexesWithRecursionWithoutParamsKKMethod(int[] nums, int target, int start){
        ArrayList<Integer> list = new ArrayList<>();
        if (start == nums.length){
            return list;
        }
        if (nums[start] == target){
            list.add(start);
        }
//        return returnAllIndexesWithRecursionWithoutParams(nums, target, ++start);
        ArrayList<Integer> answerFromBelowCalls = returnAllIndexesWithRecursionWithoutParamsKKMethod(nums, target, start+1);
        list.addAll(answerFromBelowCalls);
        return list;
    }

}
