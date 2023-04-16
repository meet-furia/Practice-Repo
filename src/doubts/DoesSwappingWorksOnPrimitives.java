package doubts;

import java.util.Arrays;

public class DoesSwappingWorksOnPrimitives {
    // Swapping works on non primitives but not on primitives as java supports only pass by value
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        System.out.println(a);
        System.out.println(b);
        swap(a, b);
        System.out.println(a);
        System.out.println(b);

        int[] arr1 = {20, 40};
        System.out.println(Arrays.toString(arr1));
        swapInArray(arr1,0, 1);
        System.out.println(Arrays.toString(arr1));
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swapInArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
