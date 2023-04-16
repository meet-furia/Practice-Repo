package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class CeilingTarget {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 7, 45, 67, 90, 93, 102, 108};
        int target = 89;
        int ceil = ceiling(arr, target);
        System.out.println(ceil);
    }
    static public int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end){
            mid = start + (end - start)/2;
            if (arr[mid] == target){
                return arr[mid];
            }

            if (arr[mid] > target){
                end = mid - 1;
            }

            if (arr[mid] < target){
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
