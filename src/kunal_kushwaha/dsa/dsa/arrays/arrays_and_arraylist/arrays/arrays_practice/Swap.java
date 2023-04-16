package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.arrays_practice;

public class Swap {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println("Before Swap");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After Swap");
        swapIndexes(array, 1, 3);
    }
    static void swapIndexes(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
