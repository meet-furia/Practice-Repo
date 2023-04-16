package kunal_kushwaha.dsa.dsa_practice_1.binary_search.leetcode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int pivot1 = findPivot(nums1);
        System.out.println(pivot1);
        int res1  = search(nums1, 1);
        System.out.println(res1);

        int[] nums2 = {1,2,4,5,6,7};
        int pivot2 = findPivot(nums2);
        System.out.println(pivot2);

        int res2 = search(nums2, 8);
        System.out.println(res2);
    }

    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return findTarget(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target){
            return pivot;
        }

        if (target >= nums[0]){
            return findTarget(nums, target, 0, pivot - 1);
        }

        return findTarget(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;
        // 4,5,6,7,0,1,2
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]){
                return mid;
            }
            else if (mid > 0 && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            else if (nums[mid] <= nums[start]){
                end =  mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findTarget(int[] nums, int target, int start, int end){
        if (target >= nums[start] && target <= nums[end]){
            while (start <= end){
                int mid = start + (end - start)/2;
                if (target > nums[mid]){
                    start = mid + 1;
                }
                else if (target < nums[mid]){
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
