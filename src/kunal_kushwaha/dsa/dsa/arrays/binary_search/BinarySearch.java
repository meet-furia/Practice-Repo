package kunal_kushwaha.dsa.dsa.arrays.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 64, 87, 92, 107, 125, 167, 198};
        int target = 198;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }
    // return index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end){
            mid = ((start + (end - start) / 2));
            if (target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                start = mid + 1;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }

}
