package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class PeakIndexInMountainArrayMyself {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,1,0};
        int peak = peakIndexInMountainArray(arr1);
        System.out.println(peak);
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;
        int mid = 0;

        while (start < end){
            mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
