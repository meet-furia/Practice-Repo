package kunal_kushwaha.dsa.dsa_practice_2.binary_search;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int res1 = search(nums1, 0);
        System.out.println(res1);

        int res2 = searchUsingRecursion(nums1, 0, 0, nums1.length - 1);
        System.out.println(res2);
    }

    static public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s)/2;
            if (nums[m] == target) {
                return m;
            }
            else if (nums[m] >= nums[s]) {
                if (target >= nums[s] && target <= nums[m]) {
                    e = m - 1;
                }
                else {
                    s = m + 1;
                }
            }
            else if (nums[m] <= nums[e]) {
                if (target >= nums[m] && target <= nums[e]) {
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }


    static public int searchUsingRecursion(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
            int m = s + (e - s)/2;
            if (nums[m] == target) {
                return m;
            }
            else if (nums[m] >= nums[s]) {
                if (target >= nums[s] && target <= nums[m]) {
                    return searchUsingRecursion(nums, target, s, m - 1);
                }
                else {
                    return searchUsingRecursion(nums, target, m + 1, e);
                }
            }
            else if (nums[m] <= nums[e]) {
                if (target >= nums[m] && target <= nums[e]) {
                    return searchUsingRecursion(nums, target, m + 1, e);
                }
                else {
                    return searchUsingRecursion(nums, target, s, m - 1);
                }
            }
            return -1;
    }

}
