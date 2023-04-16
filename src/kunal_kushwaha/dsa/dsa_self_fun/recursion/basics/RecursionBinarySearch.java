package kunal_kushwaha.dsa.dsa_self_fun.recursion.basics;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,5,7,8,10};
        int res1 = binarySearch(nums1, 5);
        System.out.println(res1);

        int res2 = binarySearch(nums1, 11);
        System.out.println(res2);

        int res3 = binarySearch(nums1, 0);
        System.out.println(res3);

        int res4 = recursiveBinarySearch(nums1, 5, 0, nums1.length - 1);
        System.out.println(res4);

        int res5 = recursiveBinarySearch(nums1, 11, 0, nums1.length - 1);
        System.out.println(res5);

        int res6 = recursiveBinarySearch(nums1, 0, 0, nums1.length - 1);
        System.out.println(res6);

    }

    static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int recursiveBinarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if (target > nums[mid]) {
            return recursiveBinarySearch(nums, target, mid + 1, end);
        }
        else if (target < nums[mid]) {
            return recursiveBinarySearch(nums, target, start, mid - 1);
        }
        else {
            return mid;
        }
    }
}
