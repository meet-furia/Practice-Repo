package kunal_kushwaha.dsa.dsa_self_fun.recursion.array_questions;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        boolean b1 = sortedOrNot(arr1, 0, 1);
        System.out.println(b1);

        int[] arr2 = {1,2,4,3,5};
        boolean b2 = sortedOrNot(arr2, 0, 1);
        System.out.println(b2);

        int[] arr3 = {2, 1};
        boolean b3 = sortedOrNot(arr3, 0, 1);
        System.out.println(b3);

    }
    static boolean sortedOrNot(int[] arr, int first, int second) {
        if (first > arr.length - 2 || second > arr.length - 1) {
            return true;
        }
        if (arr[first] < arr[second]) {
            return sortedOrNot(arr, first + 1, second + 1);
        }
        else {
            return false;
        }
    }
}
