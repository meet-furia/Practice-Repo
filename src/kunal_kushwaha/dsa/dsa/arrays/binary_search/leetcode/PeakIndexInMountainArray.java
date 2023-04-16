package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 11, 24, 46, 59, 67, 78, 84, 96, 110, 54, 44, 21};
        peakIndex(arr);
    }
    static void peakIndex(int[] arr){
        int start = 1;
        int end = arr.length - 1;
        int peak = 0;
        int mid = 0;

        while (start < end){
            mid = start + (end - start)/2;

            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else if (arr[mid] > arr[mid + 1]){
                end = mid;
             }

        }
        System.out.println(start);
    }
}
