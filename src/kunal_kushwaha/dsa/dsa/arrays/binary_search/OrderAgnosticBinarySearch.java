package kunal_kushwaha.dsa.dsa.arrays.binary_search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 64, 87, 92, 107, 125, 167, 198};
        int target = 198;
        int result = orderAgnosticBinarySearch(arr, target);
        System.out.println(result);

        int[] arr1 = {198, 167, 125, 107, 92, 4, -1, -12, -32, -48, -123, -152};
        int target1 = 54;
        int result1 = orderAgnosticBinarySearch(arr1, target1);
        System.out.println(result1);

    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            mid = ((start + (end - start)/2));

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
        }

        return -1;
    }
}

