package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

// If an array is infinite, how will you find the target with binary search i.e. by O(log n) comparison.
// Since an array is infinite we do not know the length of array we cannot use arr.length function.

public class InfiniteBinarySearch {
    public static void main(String[] args) {
//        int arr[] = {1, 5, 11, 51, 78, 94, 123, 154, 169, 175, 188, 210, 225, 284};
//        int target = 225;
//        int answer = answer(arr, target);
//        System.out.println(answer);

        int arr1[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target1 = 10;
        int answer1 = answer(arr1, target1);
        System.out.println(answer1);
    }

    static int answer(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int n = 2;
        while (target > arr[end]) { // first one is my submission commented out is kunal's
            n = n * 2;
            start = end + 1;
            end = end + n;

//            int temp = end + 1;
//            end = end + (end - start + 1) * 2;
//            start = temp;
        }

        int answer = applyBinarySearch(arr, target, start, end);
        return answer;
    }

    static int applyBinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
