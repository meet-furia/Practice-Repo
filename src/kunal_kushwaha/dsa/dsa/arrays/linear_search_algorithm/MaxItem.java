package kunal_kushwaha.dsa.dsa.arrays.linear_search_algorithm;

public class MaxItem {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 10, 99, 125, 123, 456, 78, 98};
        int maxItem = array[0];
        for (int i = 1; i < array.length; i++){
            if (maxItem < array[i]){
                maxItem = array[i];
            }
        }
        System.out.println(maxItem);
    }
}
