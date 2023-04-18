package takeuforward.sde_sheet.sde_sheet.arrays.gfg;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5,1,2};
        boolean check1 = check(arr1);
        System.out.println(check1);

        int[] arr2 = {1,2,3};
        boolean check2 = check(arr2);
        System.out.println(check2);

    }

    static public boolean check(int[] nums) {
        int end = end(nums);
        if (end == nums.length - 1) {
            return checkStartToEnd(nums, 0, nums.length - 1);
        }
        else {
            boolean check1 = checkStartToEnd(nums, end + 1, nums.length - 1);
            if (check1) {
                return checkStartToEnd(nums, 0, end);
            }
        }
        return false;
    }

    static int end(int[] nums) {
        int end = nums.length-1;
        int i = 0;
        while (i < nums.length-1) {
            if (nums[i] > nums[i + 1]) {
                end = i;
                break;
            }
            i++;
        }
        return end;
    }

    static boolean checkStartToEnd(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        if (start != 0) {
            if (nums[nums.length - 1] > nums[0]) {
                return false;
            }
        }
        return true;
    }
}
