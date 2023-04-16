package kunal_kushwaha.dsa.dsa.arrays.linear_search_algorithm;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 78, 66, 24, 68, 478, 12, 48};
        applyLinearSearchAlgorithm(arr, 48);
    }
    static void applyLinearSearchAlgorithm(int[] arr, int number){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if (number == arr[i]){
                System.out.println(number  + " found on " + i + " index position");
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("Number not found");
        }
    }
}
