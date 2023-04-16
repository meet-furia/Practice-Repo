package kunal_kushwaha.dsa.dsa.recursion.recursion.introduction_to_recursion;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 8, 15, 25, 31, 47, 54, 71};
        int target1 = 71;
        int res1 = applyBSWithRecursion(arr1, target1, 0, arr1.length-1);
        System.out.println(res1);
    }

    static int applyBSWithRecursion(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
                return applyBSWithRecursion(arr, target, start, end);
            } else if (target < arr[mid]){
                end = mid - 1;
                return applyBSWithRecursion(arr, target, start, end);
            }
            else {
                return mid;
            }
    }
}
