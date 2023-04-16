package kunal_kushwaha.dsa.dsa.recursion.recursion_practice.recursion_practice_1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num1 = {1, 6, 8, 17, 68, 150, 178, 251};
        int res = binarySearch(num1, 251, 0, num1.length-1);
        System.out.println(res);
    }

    static public int binarySearch(int[] num, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if (target > num[mid]){
            return binarySearch(num, target, mid + 1, end);
        }
        else if (target < num[mid]){
            return binarySearch(num, target, start, mid - 1);
        }
        else {
            return mid;
        }
    }
}
