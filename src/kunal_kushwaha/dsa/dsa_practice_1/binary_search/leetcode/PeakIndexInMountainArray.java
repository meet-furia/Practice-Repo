package kunal_kushwaha.dsa.dsa_practice_1.binary_search.leetcode;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr1 = {0, 3, 5, 7, 10, 15};
        int res1 = peakIndexInMountainArray(arr1);
        System.out.println(res1);

        int[] arr2 = {0, 3, 5, 10, 2};
        int res2 = peakIndexInMountainArray(arr2);
        System.out.println(res2);

    }

    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;
        int mid = 0;
        while (start < end){
            mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1] && mid < arr.length-1){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
