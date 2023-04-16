package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class FindRotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 1, 2, 3, 4};
        int numOfRotations1 = findKRotation(arr1, 5);
        System.out.println(numOfRotations1);

        int[] arr2 = {1, 2, 3, 4};
        int numOfRotations2 = findKRotation(arr2, 4);
        System.out.println(numOfRotations2);

        int[] arr3 = {8, 9, 10, 11, 1, 2, 3, 4, 5};
        int numOfRotations3 = findKRotation(arr3, 9);
        System.out.println(numOfRotations3);

        int[] arr4 = {5, 1, 2, 3, 4};
        int numOfRotations4 = findKRotation(arr4, 5);
        System.out.println(numOfRotations4);

    }

    static int findKRotation(int arr[], int n) {
        // code here
        if(arr[0] <= arr[n-1]){
            return 0;
        }

        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < n-1 && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            if(mid > 0 && arr[mid] < arr[mid - 1]){
                return mid;
            }

            if(arr[mid] < arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

}
