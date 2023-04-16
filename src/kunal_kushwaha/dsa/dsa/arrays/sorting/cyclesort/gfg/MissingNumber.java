package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort.gfg;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int mN = MissingNumber(arr, 5);
        System.out.println(mN);
    }

    static int MissingNumber(int array[], int n) {
        // Your Code Here
        applyCycleSort(array);
        int missingNumber = n;
        for (int i = 0; i < array.length; i++){
            if (array[i] != i + 1){
                return i + 1;
            }
        }
        return missingNumber;

    }
    static int[] applyCycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (correct > arr.length - 1){
                i++;
            }
            else if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
