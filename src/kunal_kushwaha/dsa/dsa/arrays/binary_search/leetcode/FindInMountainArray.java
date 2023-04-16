package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 11, 24, 46, 59, 67, 78, 84, 96, 110, 54, 44, 21};
        int target1 = 84;
        int peakElement1 = findPeakElement(arr1);
        System.out.println(peakElement1);
        int result1 = findElementInBothArrays(arr1, target1, peakElement1);
        System.out.println(result1);

        int[] arr2 = {1, 11, 24, 46, 59, 67, 78, 84, 96, 110, 54, 44, 21};
        int target2 = 97;
        int peakElement2 = findPeakElement(arr2);
        System.out.println(peakElement2);
        int result2 = findElementInBothArrays(arr2, target2, peakElement2);
        System.out.println(result2);

        int[] arr3 = {0,5,3,1};
        int target3 = 1;
        int peakElement3 = findPeakElement(arr3);
        System.out.println(peakElement3);
        int result3 = findElementInBothArrays(arr3, target3, peakElement3);
        System.out.println(result3);

    }
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//
//    }

//    static int findPeakElement(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end){
//            int mid = start + (end - start)/2;
//            if (arr[mid] < arr[mid + 1]){
//                start = mid + 1;
//            }
//            else {
//                end = mid;
//            }
//        }
//        int newStart = 0;
//        int newEnd = end;
//        int firstArray = findElement(arr, target, newStart, end);
//        if (firstArray == -1){
//            start = end + 1;
//            end = arr.length - 1;
//            firstArray = findElement(arr, target, start, end);
//        }
//        return firstArray;
//    }
//    static int findElement(int[] arr, int target, int start, int end){
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            if (arr[start] < arr[arr.length - 1]){
//                if (target > arr[mid]){
//                    start = mid + 1;
//                }
//                else if (target < arr[mid]){
//                    end = mid - 1;
//                }
//                else {
//                    return mid;
//                }
//            }
//            else {
//                if (target > arr[mid]){
//                    end = mid - 1;
//                }
//                else if (target < arr[mid]){
//                    start = mid + 1;
//                }
//                else {
//                    return mid;
//                }
//            }
//        }
//        return -1;
//    }


    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int findElementInAscendingArray(int[] arr, int target, int start, int end){
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int findElementInDescendingArray(int[] arr, int target, int start, int end){
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (target > arr[mid]){
                end = mid - 1;
            }
            else if (target < arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int findElementInBothArrays(int[] arr, int target, int peak){
        int elementInFirstArray = findElementInAscendingArray(arr, target, 0, peak);
        if (elementInFirstArray == -1){
            elementInFirstArray = findElementInDescendingArray(arr, target, peak+1, arr.length-1);
        }
        else {
            return elementInFirstArray;
        }
        return elementInFirstArray;
    }
}
