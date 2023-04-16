package kunal_kushwaha.dsa.dsa.arrays.linear_search_algorithm;

public class FindMinItem {
    public static void main(String[] args) {
        int[] array = {90, 100, 200, 107, 99, 125, 123, 456, 78, 98};
        int minItem = minItem(array);
        System.out.println(minItem);
    }
    static int minItem(int[] arr){
        int minItem = arr[0];
        for (int i = 1; i < arr.length; i++){

            if (arr[i] < minItem){
                minItem = arr[i];
            }
        }
        return minItem;
    }
}
