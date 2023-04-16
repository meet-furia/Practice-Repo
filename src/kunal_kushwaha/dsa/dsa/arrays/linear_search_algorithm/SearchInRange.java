package kunal_kushwaha.dsa.dsa.arrays.linear_search_algorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 47, 75, 92, 17, 65, 15, 36};
        int begin = 1;
        int end = 41;
        int target = 65;
        int result = searchInRange(arr, target, begin, end);
        System.out.println(result);
    }

    static int searchInRange(int[] arr, int target, int begin, int end) {
        if (begin < 0 || end < 0 || begin > arr.length - 1 || end > arr.length - 1){
            return Integer.MAX_VALUE;
        }
        for (int i = begin; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
